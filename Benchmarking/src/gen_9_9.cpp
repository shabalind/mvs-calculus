  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s3(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s2 p0;
    s0 p1;
    s4(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s3 p0;
    std::vector<s2> p1;
    s5(s3 v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  s5 f59(const std::vector<s2> &v0, const s5 &v1) {
    const std::vector<s2> v5 = v1.p1;
    const s3 v3 = v1.p0;
    const s5 v6(v3, v5);
    const std::vector<std::vector<s0>> v2 = v3.p0;
    const s2 v7 = v5[2];
    const std::vector<s0> v13 = v2[1];
    const std::vector<s2> v9 = v6.p1;
    s2 v18 = v7;
    const s0 v15 = v13[0];
    const s2 v16 = v9[0];
    const std::vector<s2> v11 = v1.p1;
    const std::vector<std::vector<s0>> v21 = v3.p0;
    v18.p0 = v15;
    std::vector<s0> v10 = v13;
    v18.p1 = v15;
    s3 v28 = v3;
    const s2 v25 = v11[1];
    const s0 v24 = v25.p0;
    std::vector<s2> v22 = v11;
    s3 v33 = v3;
    v22[2] = v18;
    const s0 v68 = v25.p1;
    std::vector<std::vector<s0>> v47 = v21;
    const std::vector<s0> v51 = v3.p1;
    std::vector<s0> v35 = v51;
    v47[0] = v13;
    s5 v59 = v1;
    s3 v26 = v33;
    const s0 v64 = v7.p0;
    v33.p1 = v51;
    v35[0] = v64;
    v35[0] = v24;
    v10[0] = v15;
    const s0 v42 = v16.p0;
    const std::vector<s0> v56 = v26.p1;
    std::vector<s0> v58 = v56;
    v59.p0 = v26;
    v26.p0 = v47;
    const std::vector<std::vector<s0>> v67 = v33.p0;
    v33.p1 = v35;
    v59.p0 = v28;
    const s0 v48 = v58[0];
    v28.p1 = v35;
    v10[0] = v68;
    const s0 v100 = v18.p0;
    v10[0] = v100;
    v59.p1 = v22;
    v22[2] = v16;
    const std::vector<s2> v123 = v59.p1;
    v47[1] = v10;
    v35[2] = v42;
    v59.p1 = v0;
    v35[1] = v48;
    v33.p0 = v67;
    std::vector<s0> v142 = v51;
    v35[0] = v100;
    v26.p1 = v142;
    const s0 v120 = v7.p0;
    v18.p1 = v120;
    s5 v180 = v59;
    v180.p1 = v123;
    return v180;
  }
  s3 f57(const s3 &v0) {
    s3 v1 = v0;
    const std::vector<s0> v4 = v1.p1;
    const s0 v3 = v4[0];
    const s0 v7 = v4[2];
    const s0 v2 = v4[0];
    const s0 v6 = v4[0];
    s3 v5 = v1;
    const std::vector<std::vector<double>> v9 = v3.p0;
    std::vector<s0> v8 = v4;
    s0 v13 = v3;
    const std::vector<std::vector<s0>> v12 = v1.p0;
    v8[1] = v2;
    v13.p0 = v9;
    const std::vector<s0> v29 = v12[1];
    v5.p1 = v8;
    const std::vector<s0> v11 = v5.p1;
    const s3 v10(v12, v11);
    v5.p1 = v11;
    v8[2] = v3;
    const std::vector<std::vector<s0>> v15 = v10.p0;
    v1.p1 = v8;
    std::vector<s0> v34 = v29;
    const std::vector<s0> v17 = v0.p1;
    v1.p0 = v15;
    std::vector<s0> v37 = v34;
    const std::vector<s3> v23 { v1, v0, v1, v0, v1, v0, v5 };
    v8[1] = v7;
    const s3 v18 = v23[1];
    const s3 v44(v15, v11);
    v13.p0 = v9;
    const std::vector<s0> v39 = v15[0];
    const s0 v27 = v37[0];
    v1.p1 = v4;
    std::vector<s0> v28 = v17;
    v1.p0 = v15;
    const std::vector<s0> v38 = v15[1];
    std::vector<std::vector<s0>> v43 = v12;
    std::vector<s0> v47 = v39;
    v43[1] = v38;
    const std::vector<s0> v94 = v44.p1;
    const std::vector<std::vector<double>> v54 = v13.p2;
    v34[0] = v13;
    const s3 v46 = v23[4];
    const std::vector<std::vector<double>> v60 = v27.p0;
    v28[0] = v27;
    v47[0] = v6;
    v43[1] = v34;
    v47[0] = v2;
    v13.p0 = v60;
    v28[1] = v7;
    v37[0] = v3;
    const std::vector<std::vector<s0>> v78 = v44.p0;
    const std::vector<s0> v63 = v1.p1;
    v1.p0 = v78;
    const s0 v71 = v8[2];
    v5.p1 = v63;
    s3 v114 = v46;
    v34 = v47;
    v1.p0 = v43;
    const std::vector<std::vector<s0>> v177 = v5.p0;
    std::vector<std::vector<s0>> v79 = v177;
    v5.p0 = v15;
    const std::vector<s0> v195 = v114.p1;
    const std::vector<s0> v110 = v18.p1;
    v13.p2 = v54;
    const std::vector<std::vector<s0>> v83 = v10.p0;
    v1.p0 = v83;
    s3 v163 = v1;
    v114.p0 = v78;
    v163.p0 = v79;
    s3 v98 = v163;
    v98.p1 = v195;
    v114.p0 = v177;
    v98.p1 = v28;
    v37[0] = v71;
    v8 = v110;
    v43[0] = v39;
    v1.p1 = v94;
    const std::vector<std::vector<s0>> v89 = v1.p0;
    v163.p0 = v89;
    return v98;
  }
  s3 f56(const s3 &v0) {
    const std::vector<std::vector<s0>> v4 = v0.p0;
    const std::vector<s0> v3 = v0.p1;
    const std::vector<s0> v8 = v0.p1;
    s3 v24 = v0;
    v24.p1 = v3;
    v24.p0 = v4;
    const s3 v43 = f57(v24);
    v24 = v0;
    const s3 v26 = f57(v43);
    v24.p0 = v4;
    v24.p1 = v8;
    return v26;
  }
  s3 f55(const s3 &v0) {
    const std::vector<s0> v1 = v0.p1;
    const s3 v2 = f57(v0);
    const s0 v11 = v1[2];
    const std::vector<std::vector<s0>> v3 = v0.p0;
    const std::vector<s0> v15 = v2.p1;
    const s3 v9 = f57(v2);
    const std::vector<s0> v16 = v9.p1;
    std::vector<s0> v18 = v16;
    std::vector<s0> v37 = v15;
    v18 = v37;
    v18[2] = v11;
    const s3 v99(v3, v18);
    return v99;
  }
  double f50(const double &v0) {
    double v2 = v0;
    double v6 = v0;
    double v11 = v0;
    double v4 = v6;
    double v1 = v11;
    double v14 = v4;
    double v8 = v14;
    const std::vector<double> v18 { v8, v11 };
    double v17 = v14;
    std::vector<double> v9 = v18;
    double v22 = v8;
    v9[0] = v2;
    v9[0] = v17;
    std::vector<double> v15 = v9;
    v9[0] = v22;
    double v39 = v1;
    v9[1] = v39;
    const double v75 = v15[0];
    return v75;
  }
  s2 f42(const s2 &v0) {
    s2 v8 = v0;
    s2 v2 = v8;
    const s0 v1 = v0.p1;
    v2.p0 = v1;
    const std::vector<double> v13 = v1.p1;
    const s0 v15 = v0.p1;
    v2.p0 = v1;
    s2 v23 = v0;
    s0 v56 = v1;
    v56.p1 = v13;
    v8 = v2;
    s2 v28 = v2;
    const std::vector<double> v42 = v56.p1;
    v23.p1 = v15;
    const s0 v63 = v28.p0;
    v56.p1 = v42;
    v8 = v23;
    const s2 v47(v56, v63);
    return v47;
  }
  double f41(const double &v0, const s4 &v1) {
    s4 v9 = v1;
    const s2 v6 = v9.p0;
    const s0 v5 = v6.p1;
    const std::vector<s4> v7 { v1 };
    const s0 v12 = v6.p0;
    v9.p1 = v5;
    const s0 v13 = v6.p1;
    const s4 v14 = v7[0];
    const s0 v18 = v14.p1;
    v9.p1 = v13;
    v9.p1 = v18;
    const s2 v17 = f42(v6);
    s2 v27 = v17;
    const std::vector<std::vector<double>> v15 = v13.p0;
    const std::vector<double> v30 = v15[1];
    v9.p1 = v12;
    const s0 v33 = v27.p0;
    const std::vector<s0> v43 { v33, v13, v12, v13, v18, v5, v18 };
    const s0 v31 = v43[2];
    v9.p1 = v31;
    const double v67 = v30[0];
    v27.p0 = v31;
    v27.p0 = v13;
    const double v134 = f50(v67);
    return v134;
  }
  s0 f35(const s0 &v0) {
    const s2 v6(v0, v0);
    const s0 v3 = v6.p0;
    s0 v2 = v0;
    s0 v12 = v0;
    const std::vector<double> v17 = v0.p1;
    v2.p1 = v17;
    const std::vector<std::vector<double>> v21 = v3.p2;
    v12.p2 = v21;
    const s1 v28(v12, v2);
    const std::vector<std::vector<double>> v37 = v3.p2;
    v2.p2 = v37;
    const s0 v45 = v28.p1;
    const s1 v24(v12, v45);
    const s0 v54 = v24.p1;
    v12.p1 = v17;
    v12.p2 = v21;
    return v54;
  }
  s2 f30(const s2 &v0) {
    s2 v4 = v0;
    const std::vector<s2> v3 { v4, v0, v4, v4 };
    const s0 v6 = v4.p1;
    const s2 v7 = v3[3];
    v4.p0 = v6;
    s0 v10 = v6;
    const std::vector<std::vector<double>> v5 = v6.p0;
    const s2 v9 = v3[0];
    const s0 v2 = v7.p1;
    v10.p0 = v5;
    const s2 v13 = f42(v7);
    const s0 v14 = v7.p0;
    std::vector<std::vector<double>> v19 = v5;
    const s0 v17 = v13.p0;
    const std::vector<std::vector<double>> v34 = v17.p2;
    const s0 v27 = f35(v10);
    std::vector<std::vector<double>> v15 = v34;
    const std::vector<double> v28 = v19[2];
    const std::vector<double> v40 = v6.p1;
    const s0 v26 = v9.p1;
    const s0 v57 = f35(v14);
    v15[0] = v28;
    const std::vector<std::vector<double>> v46 = v2.p2;
    const std::vector<double> v103 = v26.p1;
    v4.p0 = v27;
    const s2 v54 = f42(v9);
    v4.p0 = v57;
    const std::vector<double> v130 = v46[0];
    v10.p2 = v46;
    const s0 v111 = v54.p0;
    std::vector<double> v60 = v40;
    v10.p1 = v60;
    const s0 v75(v5, v103, v15);
    v4.p1 = v111;
    v15[0] = v130;
    const s4 v207(v9, v75);
    const s2 v446 = v207.p0;
    return v446;
  }
  s5 f26(const s5 &v0) {
    const std::vector<s2> v7 = v0.p1;
    const s5 v5 = f59(v7, v0);
    std::vector<s2> v4 = v7;
    const s2 v3 = v7[0];
    const s2 v1 = v7[0];
    s5 v6 = v5;
    v4[0] = v1;
    const std::vector<std::vector<s2>> v11 { v7, v7, v7, v7 };
    const s2 v10 = f30(v1);
    const std::vector<s2> v17 = v11[3];
    v4[0] = v1;
    v6.p1 = v7;
    v6.p1 = v4;
    v6.p1 = v4;
    v4[1] = v1;
    v4 = v17;
    v4[1] = v1;
    const s2 v18 = f30(v10);
    std::vector<s2> v14 = v7;
    v4[0] = v10;
    v4[1] = v3;
    const std::vector<s2> v33 = v0.p1;
    const std::vector<s2> v13 = v11[2];
    const std::vector<s2> v42 = v6.p1;
    const s0 v22 = v18.p1;
    s2 v19 = v18;
    v19.p1 = v22;
    s5 v40 = v6;
    v6.p1 = v14;
    v6.p1 = v13;
    v4 = v42;
    v4[2] = v19;
    const s3 v39 = v40.p0;
    const s3 v66 = f55(v39);
    const s3 v97 = f56(v66);
    v40.p1 = v33;
    const s3 v37 = f57(v66);
    v6.p0 = v97;
    const s5 v51 = f59(v17, v40);
    v6.p0 = v37;
    v14[1] = v1;
    return v51;
  }
  s3 f21(const s3 &v0) {
    const s3 v7 = f56(v0);
    const s3 v4 = f56(v7);
    const std::vector<std::vector<s0>> v10 = v0.p0;
    s3 v23 = v4;
    v23.p0 = v10;
    const s3 v87 = f56(v23);
    v23.p0 = v10;
    return v87;
  }
  __attribute__((noinline))
  double f0(const s5 &v0, const std::vector<std::vector<s4>> &v1, const double &v2) {
    const s5 v4 = f26(v0);
    const s3 v12 = v4.p0;
    const std::vector<s4> v7 = v1[2];
    const std::vector<s4> v13 = v1[0];
    const s3 v10 = f21(v12);
    const std::vector<s4> v25 = v1[0];
    std::vector<std::vector<s4>> v15 = v1;
    v15[1] = v13;
    const std::vector<s4> v9 = v15[2];
    v15[2] = v9;
    v15[2] = v7;
    const std::vector<s0> v30 = v10.p1;
    const s0 v38 = v30[1];
    v15[1] = v25;
    const std::vector<std::vector<double>> v59 = v38.p2;
    v15[1] = v13;
    const std::vector<double> v44 = v59[0];
    v15[2] = v13;
    const double v76 = v44[0];
    const s4 v101 = v9[0];
    const double v133 = f41(v76, v101);
    return v133;
  }
  int main() {
    s5 v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { 3.0, 4.0 }, { { 5.0 } } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } }, { 9.0, 10.0 }, { { 11.0 } } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { 15.0, 16.0 }, { { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { 21.0, 22.0 }, { { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { 27.0, 28.0 }, { { 29.0 } } } } }, { { { { { 30.0 }, { 31.0 }, { 32.0 } }, { 33.0, 34.0 }, { { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { 39.0, 40.0 }, { { 41.0 } } } }, { { { { 42.0 }, { 43.0 }, { 44.0 } }, { 45.0, 46.0 }, { { 47.0 } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { 51.0, 52.0 }, { { 53.0 } } } }, { { { { 54.0 }, { 55.0 }, { 56.0 } }, { 57.0, 58.0 }, { { 59.0 } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { 63.0, 64.0 }, { { 65.0 } } } } } });
    std::vector<std::vector<s4>> v1({ { { { { { { 66.0 }, { 67.0 }, { 68.0 } }, { 69.0, 70.0 }, { { 71.0 } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { 75.0, 76.0 }, { { 77.0 } } } }, { { { 78.0 }, { 79.0 }, { 80.0 } }, { 81.0, 82.0 }, { { 83.0 } } } } }, { { { { { { 84.0 }, { 85.0 }, { 86.0 } }, { 87.0, 88.0 }, { { 89.0 } } }, { { { 90.0 }, { 91.0 }, { 92.0 } }, { 93.0, 94.0 }, { { 95.0 } } } }, { { { 96.0 }, { 97.0 }, { 98.0 } }, { 99.0, 100.0 }, { { 101.0 } } } } }, { { { { { { 102.0 }, { 103.0 }, { 104.0 } }, { 105.0, 106.0 }, { { 107.0 } } }, { { { 108.0 }, { 109.0 }, { 110.0 } }, { 111.0, 112.0 }, { { 113.0 } } } }, { { { 114.0 }, { 115.0 }, { 116.0 } }, { 117.0, 118.0 }, { { 119.0 } } } } } });
    double v2(120.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
