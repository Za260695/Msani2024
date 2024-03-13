 <?php
 require_once('conf/conf.php');
 header("Expires: Mon, 26 Jul 1997 05:00:00 GMT"); 
 header("Last-Modified: ".gmdate("D, d M Y H:i:s")." GMT"); 
 header("Cache-Control: no-store, no-cache, must-revalidate"); 
 header("Cache-Control: post-check=0, pre-check=0", false);
 header("Pragma: no-cache"); // HTTP/1.0
 date_default_timezone_set("Asia/Bangkok");
 $tanggal= mktime(date("m"),date("d"),date("Y"));
 $jam=date("H:i");
?>
 
<div class="row">
    <div class="col s12" id="header-instansi">
        <div class="card deep-orange accent-3 white-text">
            <div class="card-content">
                <h5>
                <table border='0' witdh='100%'>
                    <tr border='0'>
                        <td>Resep Sedang di Proses</td><td>:</td>
                        <td>
                        <?php 
                            $_sql="select RIGHT(no_resep,4) as no_resep,status,no_rawat from antriapotek2" ;  
                            $hasil=bukaquery($_sql);
                            while ($data = mysqli_fetch_array ($hasil)){
                                echo $data['no_resep']." ".getOne("select concat(reg_periksa.no_rawat,' ',pasien.nm_pasien) from reg_periksa inner join pasien on reg_periksa.no_rkm_medis=pasien.no_rkm_medis where reg_periksa.no_rawat='".$data['no_rawat']."'");
                                if($data['status']=="1"){
                                   // echo "<audio autoplay='true' src='bell.wav'>";
                                    bukaquery2("update antriapotek2 set antriapotek2.status='0'");
                                }   
                            }
                        ?>
                        </td>
                    </tr>
                    <tr border='0'>
                        <td>Obat Siap Di Serahkan</td><td>:</td>
                        <td>
                        <?php 
                            $_sql="select RIGHT(no_resep,4) as no_resep,status,no_rawat from antriapotek3" ;  
                            $hasil=bukaquery($_sql);
                            while ($data = mysqli_fetch_array ($hasil)){
                                echo $data['no_resep']." ".getOne("select concat(reg_periksa.no_rawat,' ',pasien.nm_pasien) from reg_periksa inner join pasien on reg_periksa.no_rkm_medis=pasien.no_rkm_medis where reg_periksa.no_rawat='".$data['no_rawat']."'");
                                if($data['status']=="1"){
                                //echo "<audio autoplay='true' src='bell2.wav'>";
                                   $_sql2="select antriapotek3.no_resep,antriapotek3.status,antriapotek3.no_rawat,pasien.nm_pasien from antriapotek3 inner join pasien inner join reg_periksa on antriapotek3.no_rawat=reg_periksa.no_rawat and reg_periksa.no_rkm_medis=pasien.no_rkm_medis where reg_periksa.no_rawat='".$data['no_rawat']."'";
                                   //'".$data['no_rawat']."'";  
                                   $hasil2=bukaquery($_sql2);
                                   $data2 = mysqli_fetch_array ($hasil2)
                                    ?>
                                    <script type="text/javascript">
                                    responsiveVoice.speak(
                                    "Antrian apotek nomor <?= strtolower($data['no_resep']);?>,Atas nama <?= strtolower($data2['nm_pasien']);?>,Silahkan ke loket obat, ",
                                    "Indonesian Female",
                                     {
                                     pitch: 1, 
                                     rate: 0.9, 
                                     volume: 1
                                     }
                                    );</script>
                                    <?php
                                    bukaquery2("update antriapotek3 set antriapotek3.status='0'");
                                }   
                            }
                        ?>
                        </td>
                    </tr>
                </table>    
                </h5>
            </div>
        </div>
    </div>
</div>
