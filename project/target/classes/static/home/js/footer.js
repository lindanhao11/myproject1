document.writeln("<footer class=\'color-F00\'>");
document.writeln("      <div class=\'footer_wrap\'>");
document.writeln("            <div class=\'footer_2_7_2\'>");
document.writeln("            　　© Copyright buildnox2024 . All right reserved.");
document.writeln("            </div>");
document.writeln("            <div class=\'footer_2_7_1\'>");
document.writeln("            <p id=\'link_list_box\'>");
document.writeln("            友情链接:");
document.writeln("            <script id=\'links\' type=\'text/html\'>");
document.writeln("                  {{# layui.each(d.list, function(index, item){ }}");
document.writeln("                  <a href=\'{{=item.url}}\'>");
document.writeln("                   <img src=\'{{=BaseUrl}}{{=item.img}}\' />");
document.writeln("                  <span>{{=item.name}} |</span>");
document.writeln("                  </a>");
document.writeln("                  {{# }); }} {{# if(d.list.length === 0){ }} 无 {{# } }}");
document.writeln("            </script>");
document.writeln("            </p>");
document.writeln("            </div>");
document.writeln("      </div>");
document.writeln("</footer>");