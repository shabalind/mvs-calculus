  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<std::vector<s1>> p1;
    s2(std::vector<s0> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s2 p0;
    s0 p1;
    s5(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s2 f117(const s2 &v0) {
    s2 v11 = v0;
    return v11;
  }
  s5 f114(const s5 &v0) {
    s5 v4 = v0;
    s5 v5 = v0;
    const s0 v2 = v4.p1;
    const std::vector<s5> v7 { v5, v0, v4, v4, v4, v0, v0 };
    const s2 v3 = v0.p0;
    const s2 v10 = f117(v3);
    std::vector<s5> v9 = v7;
    const s2 v31 = f117(v3);
    v5.p1 = v2;
    const s2 v17 = f117(v31);
    const s5 v22 = v9[1];
    const std::vector<s0> v13 { v2, v2, v2, v2 };
    const s0 v20 = v13[1];
    const s2 v21 = f117(v17);
    v4.p1 = v2;
    v5.p0 = v3;
    s2 v16 = v10;
    const s2 v30 = f117(v3);
    v9[0] = v4;
    v4.p0 = v16;
    const std::vector<s0> v35 = v21.p0;
    std::vector<s0> v40 = v35;
    v5.p0 = v17;
    const s0 v58 = v0.p1;
    const s0 v60 = v40[0];
    s5 v103 = v22;
    v103.p1 = v60;
    v5.p1 = v2;
    v5.p1 = v20;
    v103 = v5;
    v103.p0 = v30;
    v103.p1 = v58;
    return v103;
  }
  s2 f112(const s2 &v0) {
    const s2 v1 = f117(v0);
    const s2 v2 = f117(v1);
    const s2 v8 = f117(v1);
    const std::vector<std::vector<s1>> v5 = v8.p1;
    std::vector<std::vector<s1>> v7 = v5;
    std::vector<std::vector<s1>> v3 = v7;
    const s2 v13 = f117(v2);
    const std::vector<s1> v4 = v7[0];
    const s2 v19 = f117(v13);
    std::vector<s1> v18 = v4;
    const s1 v15 = v18[0];
    const s1 v10 = v4[0];
    s1 v14 = v10;
    const s2 v17 = f117(v19);
    const std::vector<s1> v32 = v7[0];
    const std::vector<s1> v22 { v14, v15, v10, v15, v15 };
    const std::vector<std::vector<s1>> v36 = v17.p1;
    const s1 v31 = v18[0];
    const std::vector<s1> v21 = v7[0];
    std::vector<s1> v30 = v21;
    const std::vector<s0> v34 = v8.p0;
    std::vector<s1> v20 = v32;
    const std::vector<std::vector<s1>> v50 { v20, v20, v30 };
    const std::vector<s1> v27 = v3[0];
    const s1 v23 = v30[0];
    std::vector<std::vector<s1>> v39 = v50;
    const s1 v56 = v22[3];
    const std::vector<s0> v57 = v14.p0;
    v18[0] = v31;
    v39[0] = v30;
    const s0 v41 = v34[0];
    v14.p1 = v41;
    v18[0] = v14;
    const s0 v98 = v57[2];
    const std::vector<std::vector<double>> v47 = v98.p1;
    const std::vector<s0> v44 = v15.p0;
    v7[0] = v27;
    s0 v49 = v41;
    const s0 v89 = v44[2];
    v14.p1 = v49;
    v18[0] = v23;
    std::vector<std::vector<double>> v107 = v47;
    const s5 v129(v0, v89);
    const s5 v69 = f114(v129);
    std::vector<std::vector<s1>> v80 = v39;
    v49.p1 = v107;
    v39[1] = v20;
    const std::vector<s0> v133 = v31.p0;
    const std::vector<s1> v74 = v80[0];
    v14.p0 = v133;
    const s5 v123 = f114(v69);
    const s0 v120 = v56.p1;
    const s5 v114 = f114(v123);
    v7[0] = v74;
    const s2 v122 = v114.p0;
    const std::vector<std::vector<double>> v135 = v89.p0;
    v49.p0 = v135;
    v14.p1 = v120;
    v3 = v36;
    v39[2] = v18;
    return v122;
  }
  s2 f110(const s2 &v0) {
    const s2 v2 = f112(v0);
    const s2 v12 = f112(v2);
    const s2 v10 = f117(v12);
    return v10;
  }
  s0 f108(const s0 &v0) {
    const std::vector<std::vector<double>> v2 = v0.p0;
    const std::vector<std::vector<double>> v1 = v0.p0;
    s0 v5 = v0;
    v5.p0 = v1;
    v5.p0 = v2;
    return v5;
  }
  std::vector<s0> f107(const std::vector<s0> &v0) {
    const std::vector<std::vector<s0>> v7 { v0, v0, v0, v0, v0, v0, v0 };
    std::vector<std::vector<s0>> v6 = v7;
    std::vector<std::vector<s0>> v9 = v6;
    v9[1] = v0;
    const std::vector<s0> v18 = v9[2];
    return v18;
  }
  std::vector<s0> f106(const std::vector<s0> &v0) {
    std::vector<s0> v6 = v0;
    const s0 v4 = v0[0];
    std::vector<s0> v2 = v6;
    const s0 v13 = v2[0];
    const s0 v5 = v2[0];
    const std::vector<s0> v9 = f107(v2);
    v2[0] = v5;
    v6[0] = v13;
    v2[0] = v13;
    v2[0] = v13;
    v2[0] = v13;
    v6[0] = v4;
    const s0 v75 = f108(v4);
    v2[0] = v75;
    const std::vector<s0> v137 = f107(v9);
    return v137;
  }
  s0 f95(const s0 &v0) {
    const s0 v1 = f108(v0);
    const std::vector<std::vector<double>> v3 = v1.p0;
    s0 v7 = v1;
    const std::vector<std::vector<double>> v9 = v0.p0;
    std::vector<std::vector<double>> v8 = v9;
    v7.p0 = v9;
    s0 v4 = v1;
    const s0 v5 = f108(v7);
    const std::vector<double> v2 = v3[0];
    std::vector<double> v20 = v2;
    std::vector<double> v15 = v20;
    const std::vector<double> v13 = v3[0];
    const double v25 = v13[0];
    const s0 v14 = f108(v5);
    s0 v10 = v4;
    double v24 = v25;
    const std::vector<double> v19 = v8[0];
    v10.p0 = v9;
    std::vector<std::vector<double>> v12 = v8;
    double v16 = v25;
    v4.p0 = v12;
    v7.p0 = v12;
    v20[0] = v16;
    const s0 v71 = f108(v0);
    const std::vector<std::vector<double>> v29 = v4.p1;
    v8[0] = v15;
    const std::vector<std::vector<double>> v21 = v14.p0;
    const std::vector<std::vector<double>> v34 = v71.p1;
    v8[0] = v19;
    v12 = v8;
    v15[0] = v24;
    v15[0] = v24;
    v7.p1 = v29;
    const std::vector<double> v38 = v34[2];
    std::vector<std::vector<double>> v103 = v34;
    v10.p1 = v103;
    v103[1] = v15;
    v8[0] = v38;
    v20[0] = v25;
    v10.p0 = v21;
    return v10;
  }
  s1 f54(const s1 &v0) {
    const s0 v2 = v0.p1;
    s1 v1 = v0;
    v1.p1 = v2;
    const s0 v5 = f95(v2);
    v1 = v0;
    const s0 v6 = f95(v5);
    v1.p1 = v5;
    const std::vector<s0> v25 = v1.p0;
    const s0 v28 = v25[0];
    const s0 v19 = f95(v6);
    const s0 v33 = f95(v6);
    const s0 v93 = v0.p1;
    s1 v41 = v1;
    const s0 v22 = f95(v93);
    const s0 v16 = f108(v28);
    const s0 v46 = f95(v22);
    v41.p1 = v6;
    v1.p0 = v25;
    s1 v31 = v41;
    v31.p0 = v25;
    v31.p0 = v25;
    const s0 v84 = f108(v16);
    v1.p0 = v25;
    v31.p1 = v19;
    v1.p1 = v19;
    const s0 v112 = f95(v33);
    v31.p1 = v46;
    v41.p1 = v84;
    v41.p1 = v112;
    return v31;
  }
  s1 f49(const s1 &v0) {
    s1 v1 = v0;
    s1 v3 = v1;
    const std::vector<s0> v6 = v1.p0;
    const std::vector<s0> v2 = v3.p0;
    const std::vector<s0> v5 = v0.p0;
    const s1 v7 = f54(v3);
    const s0 v27 = v5[2];
    const s1 v17 = f54(v7);
    v1.p0 = v5;
    v3.p0 = v5;
    v1.p1 = v27;
    const s1 v28 = f54(v17);
    v3.p0 = v2;
    const std::vector<s1> v142 { v7, v28 };
    const std::vector<s0> v55 = v3.p0;
    std::vector<s1> v138 = v142;
    v3.p0 = v6;
    const s1 v106 = v138[1];
    v1.p0 = v55;
    const s1 v95 = f54(v106);
    const s1 v121 = f54(v28);
    v3 = v121;
    return v95;
  }
  s2 f42(const s2 &v0) {
    const s2 v7 = f110(v0);
    const s2 v2 = f117(v7);
    const std::vector<s0> v6 = v7.p0;
    const std::vector<s0> v3 = f107(v6);
    const std::vector<std::vector<s1>> v9 = v2.p1;
    const std::vector<std::vector<s1>> v5 = v2.p1;
    const std::vector<std::vector<s0>> v10 { v3, v6, v3 };
    const s2 v11 = f117(v0);
    const std::vector<s0> v13 = v7.p0;
    std::vector<std::vector<s1>> v18 = v5;
    const s0 v30 = v13[0];
    const s2 v8 = f110(v11);
    const s2 v12 = f117(v7);
    const std::vector<s0> v14 = v10[2];
    s2 v17 = v12;
    const std::vector<s0> v42 = v17.p0;
    v17.p0 = v6;
    const std::vector<s1> v16 = v9[0];
    v18[0] = v16;
    v17 = v8;
    const std::vector<s1> v48 = v9[0];
    v18[0] = v16;
    v18[0] = v48;
    const std::vector<s1> v22 = v9[0];
    const std::vector<s0> v29 = v8.p0;
    const s0 v49 = f95(v30);
    v17.p1 = v5;
    v17.p1 = v18;
    const s1 v50 = v22[0];
    const s0 v53 = v50.p1;
    v17.p0 = v13;
    std::vector<s0> v59 = v42;
    s2 v55 = v11;
    v18[0] = v22;
    v59[0] = v49;
    v55.p0 = v29;
    const std::vector<std::vector<s1>> v180 = v8.p1;
    v55.p0 = v14;
    v59[0] = v53;
    v18[0] = v22;
    v18 = v180;
    v18[0] = v16;
    v55.p0 = v59;
    return v55;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    s2 v5 = v0;
    const s2 v4 = f112(v5);
    const std::vector<s0> v10 = v0.p0;
    const s2 v11 = f112(v0);
    const std::vector<s0> v3 = v5.p0;
    const std::vector<s0> v13 = f107(v3);
    std::vector<s0> v21 = v13;
    const s0 v14 = v13[0];
    s0 v16 = v14;
    const std::vector<std::vector<double>> v19 = v16.p0;
    const s2 v26 = f42(v11);
    const s0 v25 = f95(v16);
    const std::vector<s0> v35 = f106(v10);
    v21[0] = v25;
    const std::vector<std::vector<s1>> v28 = v4.p1;
    v21 = v10;
    const std::vector<std::vector<s1>> v24 = v26.p1;
    const std::vector<std::vector<double>> v23 = v16.p1;
    v21[0] = v16;
    std::vector<std::vector<s1>> v53 = v28;
    const std::vector<s1> v62 = v53[0];
    v5.p0 = v21;
    v5.p1 = v24;
    const std::vector<double> v60 = v23[1];
    const s0 v46 = v35[0];
    const double v51 = v60[0];
    const s1 v57 = v62[0];
    v21[0] = v46;
    double v114 = v51;
    s1 v54 = v57;
    const s1 v99 = f49(v54);
    const s0 v102 = v99.p1;
    v16.p0 = v19;
    v21[0] = v102;
    return v114;
  }
  int main() {
    s2 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } }, { { { { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } } } });
    double v1(20.0);
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
