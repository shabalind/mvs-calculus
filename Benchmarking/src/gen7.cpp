  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s2> p0;
    std::vector<s1> p1;
    s3(std::vector<s2> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  std::vector<s1> f81(const std::vector<s1> &v0) {
    const s1 v5 = v0[0];
    const s0 v4 = v5.p1;
    const s0 v1 = v5.p1;
    s1 v2 = v5;
    const s1 v16 = v0[0];
    const std::vector<std::vector<double>> v12 = v4.p0;
    s0 v9 = v4;
    const std::vector<double> v8 = v12[0];
    v9.p0 = v12;
    v2.p0 = v4;
    const s1 v18 = v0[1];
    v9.p0 = v12;
    v9 = v4;
    const s0 v50 = v2.p1;
    v2.p0 = v9;
    s1 v20 = v18;
    std::vector<s1> v10 = v0;
    const std::vector<std::vector<double>> v15 = v1.p1;
    v10[0] = v2;
    const std::vector<std::vector<double>> v25 = v50.p1;
    std::vector<std::vector<double>> v14 = v15;
    const std::vector<std::vector<double>> v17 = v9.p2;
    const s1 v19 = v0[1];
    const std::vector<double> v26 = v12[0];
    s1 v39 = v16;
    v10[1] = v19;
    const s0 v24 = v39.p1;
    v14[1] = v8;
    s0 v28 = v50;
    v9.p1 = v25;
    std::vector<s1> v21 = v10;
    const s0 v33 = v18.p1;
    std::vector<std::vector<double>> v43 = v12;
    std::vector<double> v40 = v26;
    v9.p1 = v17;
    v10[1] = v2;
    s1 v27 = v19;
    s0 v35 = v33;
    std::vector<std::vector<double>> v60 = v25;
    const std::vector<double> v29 = v60[1];
    const std::vector<std::vector<double>> v87 = v35.p2;
    const s0 v47 = v27.p1;
    v10[1] = v20;
    v28.p0 = v12;
    const std::vector<double> v46 = v14[1];
    v2.p1 = v47;
    const std::vector<double> v38 = v43[0];
    v43[0] = v29;
    v28.p0 = v43;
    v60[1] = v40;
    v2.p0 = v1;
    v43[0] = v46;
    const std::vector<std::vector<double>> v42 = v28.p0;
    v35.p2 = v25;
    const std::vector<double> v156 = v14[0];
    const s0 v150 = v5.p0;
    v10[0] = v27;
    v20.p0 = v150;
    v2.p0 = v24;
    const std::vector<double> v88 = v42[0];
    v14[0] = v38;
    v10[1] = v18;
    v60[1] = v156;
    v10 = v21;
    v10[1] = v2;
    v39.p0 = v28;
    v35.p1 = v25;
    v20.p1 = v1;
    v28.p1 = v87;
    v2.p1 = v9;
    s0 v103 = v24;
    v39.p1 = v28;
    v60[1] = v38;
    v14[1] = v88;
    std::vector<s1> v166 = v21;
    v2.p0 = v103;
    return v166;
  }
  s2 f74(const s2 &v0) {
    return v0;
  }
  s0 f72(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p1;
    const s1 v11(v0, v0);
    const s0 v9 = v11.p1;
    s1 v15 = v11;
    s0 v21 = v9;
    v21.p1 = v5;
    s0 v18 = v21;
    v15.p0 = v18;
    const s0 v49 = v15.p0;
    v15.p1 = v9;
    return v49;
  }
  s1 f71(const s1 &v0) {
    const s0 v5 = v0.p1;
    const s0 v2 = f72(v5);
    const s2 v4(v0, v2);
    s1 v8 = v0;
    v8 = v0;
    const s0 v7 = f72(v2);
    v8.p1 = v5;
    const s2 v12 = f74(v4);
    s2 v6 = v4;
    v6.p1 = v5;
    s1 v22 = v8;
    v22 = v8;
    v22.p1 = v7;
    const s1 v33(v2, v2);
    const s2 v42 = f74(v6);
    const s1 v32 = v12.p0;
    v6.p0 = v22;
    const s1 v81 = v42.p0;
    s1 v44 = v22;
    const s2 v34 = f74(v42);
    const s0 v61 = v44.p1;
    v44 = v81;
    v8.p0 = v61;
    const s0 v39 = v81.p0;
    v44.p1 = v61;
    const s0 v67 = v32.p0;
    const s0 v51 = v34.p1;
    v8 = v44;
    v6.p1 = v67;
    const s0 v96 = v81.p0;
    const s0 v98 = f72(v51);
    s0 v68 = v39;
    v44.p0 = v98;
    v8.p0 = v96;
    v44.p0 = v68;
    v6.p0 = v33;
    return v44;
  }
  s3 f70(const s3 &v0) {
    const std::vector<s1> v2 = v0.p1;
    std::vector<s1> v5 = v2;
    const s1 v4 = v5[0];
    v5[0] = v4;
    s3 v61 = v0;
    v61.p1 = v5;
    return v61;
  }
  s2 f67(const s2 &v0, const s2 &v1) {
    const std::vector<s2> v5 { v1, v1 };
    const s2 v4 = v5[1];
    const s2 v9 = v5[0];
    const s1 v14 = v4.p0;
    const s1 v25 = f71(v14);
    const s0 v45 = v9.p1;
    const s2 v37(v25, v45);
    return v37;
  }
  s2 f60(const s2 &v0) {
    const s2 v2 = f74(v0);
    s2 v7 = v2;
    const s0 v6 = v2.p1;
    const std::vector<std::vector<double>> v4 = v6.p0;
    std::vector<std::vector<double>> v1 = v4;
    const std::vector<std::vector<double>> v11 = v6.p1;
    const s0 v9 = f72(v6);
    const s1 v5 = v2.p0;
    const s0 v12 = f72(v6);
    const std::vector<std::vector<double>> v15 = v6.p0;
    const s0 v20(v1, v11, v11);
    s0 v31 = v9;
    const s0 v14 = f72(v12);
    const std::vector<double> v24 = v11[1];
    s1 v21 = v5;
    v7.p1 = v14;
    const s0 v22 = v7.p1;
    v21.p0 = v20;
    v1[0] = v24;
    const std::vector<std::vector<double>> v71 = v22.p2;
    std::vector<std::vector<double>> v121 = v71;
    const std::vector<double> v107 = v15[0];
    const s2 v85(v21, v31);
    v31.p1 = v121;
    v121[0] = v107;
    v31.p0 = v1;
    const s2 v169 = f74(v85);
    return v169;
  }
  s3 f56(const s3 &v0) {
    const s3 v7 = f70(v0);
    s3 v4 = v0;
    const std::vector<s1> v3 = v7.p1;
    const s3 v6 = f70(v7);
    const std::vector<s1> v8 = f81(v3);
    const std::vector<s2> v10 = v6.p0;
    v4.p0 = v10;
    v4.p1 = v8;
    return v4;
  }
  s3 f53(const s3 &v0) {
    s3 v6 = v0;
    const s3 v4 = f70(v6);
    const std::vector<s1> v8 = v0.p1;
    v6.p1 = v8;
    std::vector<s1> v5 = v8;
    const s1 v13 = v5[1];
    v6.p1 = v5;
    const s0 v7 = v13.p1;
    s0 v9 = v7;
    const std::vector<std::vector<double>> v2 = v9.p1;
    s0 v3 = v9;
    v9.p1 = v2;
    const s0 v17 = f72(v3);
    std::vector<s1> v18 = v5;
    v18[0] = v13;
    const s1 v11(v7, v17);
    std::vector<std::vector<double>> v19 = v2;
    const s1 v29 = v8[1];
    const std::vector<s1> v25 = v0.p1;
    v18 = v8;
    s1 v20 = v13;
    v5[0] = v29;
    const std::vector<double> v24 = v19[1];
    v9.p2 = v2;
    v5[1] = v29;
    v3.p2 = v19;
    const std::vector<s1> v33 = f81(v18);
    v18[1] = v20;
    v19[0] = v24;
    v3.p1 = v19;
    v3.p1 = v2;
    const std::vector<s2> v36 = v4.p0;
    const std::vector<s2> v32 = v0.p0;
    v3.p1 = v19;
    v5[1] = v13;
    const s3 v61(v36, v33);
    v9.p2 = v2;
    v20.p0 = v3;
    const std::vector<s1> v73 = f81(v25);
    v5[0] = v13;
    v18[0] = v13;
    v3.p2 = v19;
    v6.p0 = v32;
    v18[0] = v11;
    const s3 v58 = f70(v61);
    v6.p1 = v33;
    v6.p1 = v73;
    v5[1] = v13;
    v6.p0 = v32;
    return v58;
  }
  s0 f50(const std::vector<double> &v0, const s0 &v1) {
    s0 v4 = v1;
    s0 v8 = v4;
    const s0 v7 = f72(v8);
    const std::vector<std::vector<double>> v9 = v4.p2;
    s0 v2 = v7;
    const s1 v11(v2, v2);
    const std::vector<std::vector<double>> v12 = v2.p0;
    std::vector<std::vector<double>> v19 = v12;
    v19[0] = v0;
    const s1 v35 = f71(v11);
    const s0 v33 = v35.p1;
    v19[0] = v0;
    v2.p2 = v9;
    v4.p0 = v19;
    v19[0] = v0;
    v19[0] = v0;
    return v33;
  }
  s0 f46(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    const std::vector<double> v1 = v5[0];
    const std::vector<std::vector<double>> v2 = v0.p0;
    const double v3 = v1[0];
    const double v7 = v1[0];
    const std::vector<double> v9 = v5[0];
    const std::vector<std::vector<double>> v8 = v0.p1;
    s0 v11 = v0;
    const std::vector<double> v17 = v8[0];
    double v10 = v3;
    std::vector<double> v14 = v9;
    v14[0] = v7;
    const std::vector<std::vector<double>> v13 = v11.p1;
    v11.p2 = v13;
    const std::vector<std::vector<double>> v18 = v0.p0;
    const std::vector<std::vector<double>> v12 = v0.p1;
    std::vector<double> v24 = v14;
    std::vector<std::vector<double>> v35 = v8;
    const double v19 = v3 / v3;
    v24[0] = v19;
    const std::vector<std::vector<double>> v15 = v0.p1;
    const std::vector<std::vector<double>> v20 = v11.p1;
    v35[0] = v14;
    v11.p1 = v15;
    v24[0] = v10;
    v35[1] = v14;
    v11.p1 = v20;
    v11.p2 = v15;
    std::vector<std::vector<double>> v54 = v12;
    v24[0] = v19;
    std::vector<std::vector<double>> v16 = v35;
    v35[1] = v14;
    v11.p1 = v54;
    const s0 v21 = f50(v17, v0);
    const std::vector<std::vector<double>> v33 = v11.p1;
    std::vector<std::vector<double>> v22 = v35;
    const std::vector<double> v28 = v2[0];
    s0 v41 = v11;
    const s0 v61 = f72(v21);
    v41.p0 = v2;
    const std::vector<double> v44 = v13[0];
    v41.p2 = v33;
    v54[1] = v1;
    v16[1] = v24;
    const std::vector<std::vector<double>> v55 = v41.p0;
    const std::vector<std::vector<double>> v82 = v61.p0;
    const std::vector<double> v36 = v16[0];
    v11.p0 = v82;
    const std::vector<double> v47 = v18[0];
    const std::vector<std::vector<double>> v84 { v24, v44, v47, v28, v36, v17, v14 };
    const std::vector<std::vector<double>> v94 = v21.p0;
    const std::vector<std::vector<double>> v83 = v61.p2;
    v41.p1 = v83;
    v41.p2 = v20;
    const std::vector<double> v105 = v84[1];
    v41.p0 = v94;
    v11.p2 = v22;
    v24 = v44;
    v11.p0 = v55;
    const s0 v160 = f50(v105, v0);
    return v160;
  }
  s0 f42(const s0 &v0) {
    const s0 v1 = f46(v0);
    const std::vector<std::vector<double>> v5 = v0.p2;
    const std::vector<double> v6 = v5[1];
    const s0 v2 = f72(v1);
    std::vector<double> v7 = v6;
    const s0 v10 = f72(v1);
    std::vector<std::vector<double>> v9 = v5;
    const std::vector<std::vector<double>> v4 = v10.p1;
    v9[0] = v7;
    std::vector<std::vector<double>> v17 = v9;
    const std::vector<std::vector<double>> v11 = v2.p0;
    v17[1] = v6;
    std::vector<std::vector<double>> v14 = v11;
    v14[0] = v7;
    v9[0] = v6;
    v9[0] = v6;
    const s0 v110(v14, v4, v17);
    return v110;
  }
  double f37(const double &v0, const s1 &v1) {
    const s1 v6 = f71(v1);
    const s0 v2 = v6.p0;
    const s0 v10 = f72(v2);
    const std::vector<std::vector<double>> v4 = v2.p1;
    double v7 = v0;
    s0 v8 = v2;
    const s0 v13 = f42(v10);
    v8 = v13;
    const std::vector<std::vector<double>> v32 = v8.p0;
    v8.p2 = v4;
    const std::vector<double> v23 = v32[0];
    const double v57 = v0 / v7;
    const double v74 = v23[0];
    const double v25 = v74 - v57;
    v7 = v25;
    double v93 = v57;
    v93 = v25;
    return v93;
  }
  std::vector<s2> f35(const s1 &v0, const std::vector<s2> &v1) {
    const std::vector<std::vector<s2>> v7 { v1, v1, v1 };
    const std::vector<s2> v65 = v7[1];
    return v65;
  }
  s1 f27(const s1 &v0) {
    const s1 v6 = f71(v0);
    const s1 v24 = f71(v6);
    return v24;
  }
  s0 f25(const s0 &v0, const std::vector<s3> &v1, const s2 &v2, const s1 &v3) {
    const s2 v4 = f60(v2);
    const s2 v7 = f60(v4);
    s2 v19 = v4;
    const std::vector<s2> v25 { v19, v7 };
    const s2 v20 = v25[1];
    const s0 v43 = v20.p1;
    return v43;
  }
  s3 f14(const s3 &v0) {
    const s3 v3 = f70(v0);
    const std::vector<s2> v4 = v0.p0;
    const s2 v2 = v4[0];
    s2 v11 = v2;
    s2 v8 = v11;
    const s1 v12 = v8.p0;
    const std::vector<s1> v16 { v12, v12 };
    const s3 v35 = f56(v0);
    const std::vector<s2> v29 = v3.p0;
    std::vector<s2> v47 = v29;
    const s3 v38 = f53(v3);
    s3 v60 = v35;
    v60.p0 = v47;
    const std::vector<s2> v106 = v38.p0;
    v47[0] = v8;
    v60.p0 = v106;
    v60.p1 = v16;
    v47 = v4;
    return v60;
  }
  s1 f3(const s0 &v0, const s1 &v1) {
    s0 v2 = v0;
    const std::vector<std::vector<double>> v7 = v2.p0;
    v2.p0 = v7;
    const std::vector<double> v9 = v7[0];
    v2.p0 = v7;
    const s0 v5 = v1.p0;
    const s0 v11 = v1.p0;
    v2 = v11;
    const double v3 = v9[0];
    v2.p0 = v7;
    std::vector<double> v13 = v9;
    const s0 v10 = f46(v5);
    const std::vector<std::vector<double>> v12 = v2.p0;
    s1 v20 = v1;
    const std::vector<double> v16 = v12[0];
    const s0 v36 = f50(v13, v0);
    v13[0] = v3;
    const s0 v15 = f46(v10);
    const double v30 = v16[0];
    const double v28 = f37(v3, v1);
    double v35 = v30;
    v13[0] = v28;
    v20.p1 = v15;
    s1 v34 = v20;
    v20.p1 = v36;
    v13[0] = v35;
    const s1 v96 = f27(v34);
    return v96;
  }
  s3 f1(const s3 &v0) {
    s3 v2 = v0;
    const std::vector<s2> v3 = v0.p0;
    const std::vector<s1> v5 = v2.p1;
    const std::vector<s2> v4 = v0.p0;
    const s2 v8 = v4[0];
    v2.p0 = v3;
    const std::vector<s1> v17 = v2.p1;
    v2.p1 = v17;
    s2 v15 = v8;
    s2 v16 = v15;
    const s1 v22 = v16.p0;
    const s2 v38 = v3[0];
    const s0 v53 = v38.p1;
    const s0 v43 = v22.p0;
    const std::vector<s2> v91 = f35(v22, v4);
    const s3 v50(v91, v5);
    v2.p1 = v5;
    v15.p1 = v53;
    const std::vector<s2> v171 = v2.p0;
    v15.p1 = v43;
    v2.p0 = v171;
    return v50;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    std::vector<s3> v7 = v0;
    const s3 v4 = v7[0];
    const std::vector<s2> v5 = v4.p0;
    const s3 v8 = v0[2];
    double v2 = v1;
    v2 = v1;
    std::vector<s3> v3 = v7;
    const s2 v14 = v5[0];
    std::vector<s2> v11 = v5;
    v3[0] = v8;
    const s1 v17 = v14.p0;
    const s2 v6 = f67(v14, v14);
    const s0 v10 = v6.p1;
    const s3 v13 = v0[0];
    const s0 v16 = f25(v10, v7, v14, v17);
    const s3 v25 = v0[0];
    const s3 v20 = f14(v8);
    v7[2] = v4;
    const s3 v30 = v0[1];
    const s1 v19 = v14.p0;
    const s3 v27 = f1(v30);
    const s3 v33 = v7[2];
    v7[2] = v8;
    s3 v43 = v25;
    const s1 v64 = f3(v16, v19);
    std::vector<s3> v71 = v3;
    const s3 v44 = f70(v13);
    v7[2] = v33;
    v43.p0 = v5;
    v3[2] = v13;
    const s3 v54 = v7[2];
    v71[2] = v27;
    const s0 v117 = v64.p1;
    v7[0] = v8;
    v71[1] = v43;
    const s2 v72 = v11[0];
    s3 v94 = v54;
    const s0 v76 = f25(v117, v71, v72, v64);
    const s3 v104 = v71[2];
    const std::vector<s1> v141 = v25.p1;
    const std::vector<std::vector<double>> v248 = v76.p1;
    v94.p1 = v141;
    const std::vector<s1> v118 = v94.p1;
    v94.p1 = v118;
    v7[1] = v104;
    s3 v180 = v44;
    v43 = v20;
    const std::vector<double> v105 = v248[0];
    const double v220 = v105[0];
    v7[2] = v43;
    v43 = v94;
    const double v158 = v220 * v2;
    v7[0] = v180;
    v71[0] = v8;
    return v158;
  }
  int main() {
    std::vector<s3> v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 } }, { { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { 10.0 } }, { { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } } }, { { { { { 15.0 } }, { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } }, { { { { 25.0 } }, { { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 } }, { { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } } } }, { { { { { { { 35.0 } }, { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } }, { { { 40.0 } }, { { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } } }, { { { 45.0 } }, { { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } } } }, { { { { { 50.0 } }, { { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } }, { { { 55.0 } }, { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } }, { { { { 60.0 } }, { { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 } } }, { { { 65.0 } }, { { 66.0 }, { 67.0 } }, { { 68.0 }, { 69.0 } } } } } }, { { { { { { { 70.0 } }, { { 71.0 }, { 72.0 } }, { { 73.0 }, { 74.0 } } }, { { { 75.0 } }, { { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } } }, { { { 80.0 } }, { { 81.0 }, { 82.0 } }, { { 83.0 }, { 84.0 } } } } }, { { { { { 85.0 } }, { { 86.0 }, { 87.0 } }, { { 88.0 }, { 89.0 } } }, { { { 90.0 } }, { { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 } } } }, { { { { 95.0 } }, { { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } }, { { { 100.0 } }, { { 101.0 }, { 102.0 } }, { { 103.0 }, { 104.0 } } } } } } });
    double v1(105.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
