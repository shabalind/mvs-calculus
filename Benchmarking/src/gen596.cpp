  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<std::vector<s0>> p1;
    s2(s1 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    std::vector<s2> p1;
    s3(std::vector<s1> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  s1 f89(const s1 &v0) {
    const s0 v1 = v0.p0;
    s0 v6 = v1;
    s1 v5 = v0;
    const s0 v3 = v5.p0;
    const std::vector<std::vector<double>> v10 = v3.p0;
    v6.p1 = v10;
    v6.p0 = v10;
    const s0 v14 = v0.p0;
    v5.p1 = v14;
    s1 v21 = v0;
    const s0 v33 = v21.p1;
    s0 v146 = v6;
    const s1 v68(v33, v146);
    return v68;
  }
  std::vector<s2> f84(const s3 &v0, const std::vector<s2> &v1) {
    const s2 v2 = v1[0];
    s2 v3 = v2;
    std::vector<s2> v9 = v1;
    const std::vector<std::vector<s0>> v15 = v2.p1;
    std::vector<s2> v12 = v9;
    const std::vector<std::vector<s0>> v17 = v2.p1;
    const std::vector<s2> v14 = v0.p1;
    std::vector<s2> v21 = v12;
    std::vector<s2> v24 = v21;
    v24[0] = v2;
    const s2 v26 = v14[0];
    v12 = v24;
    v3.p1 = v15;
    v12[1] = v26;
    v3.p1 = v17;
    v21 = v1;
    v9[0] = v3;
    return v12;
  }
  s1 f80(const s1 &v0) {
    const s0 v2 = v0.p1;
    s0 v1 = v2;
    s0 v3 = v2;
    const std::vector<std::vector<double>> v5 = v1.p2;
    s1 v8 = v0;
    std::vector<std::vector<double>> v7 = v5;
    const std::vector<double> v6 = v7[0];
    v7[0] = v6;
    const s1 v11 = f89(v8);
    const s1 v10(v2, v3);
    s1 v15 = v11;
    const s1 v18 = f89(v8);
    const std::vector<std::vector<double>> v14 = v1.p1;
    const s0 v13 = v18.p0;
    const s1 v22 = f89(v10);
    s1 v27 = v22;
    const s0 v24 = v8.p1;
    v3.p1 = v14;
    const std::vector<std::vector<double>> v36 = v24.p1;
    v3.p2 = v7;
    const s0 v21 = v11.p1;
    const s1 v26 = f89(v0);
    v8.p0 = v3;
    const s1 v49 = f89(v27);
    const s0 v61 = v26.p0;
    const std::vector<std::vector<double>> v56 = v13.p1;
    const s0 v176 = v15.p0;
    v15.p0 = v1;
    const s1 v64 = f89(v49);
    const s1 v77 = f89(v11);
    v27.p1 = v1;
    v15 = v77;
    const std::vector<double> v60 = v7[0];
    v3.p0 = v36;
    v27.p1 = v21;
    v7[0] = v60;
    v8.p1 = v61;
    v3.p1 = v56;
    v27.p1 = v176;
    return v64;
  }
  s3 f75(const s3 &v0) {
    s3 v2 = v0;
    const std::vector<s1> v29 = v0.p0;
    v2.p0 = v29;
    s3 v47 = v2;
    return v47;
  }
  s1 f73(const s1 &v0) {
    s1 v7 = v0;
    const s1 v5 = f80(v7);
    const s1 v6 = f80(v7);
    const s0 v9 = v5.p1;
    const s1 v2 = f80(v0);
    const s0 v10 = v6.p0;
    const s1 v12 = f80(v2);
    const s0 v8 = v0.p0;
    const s1 v27 = f89(v12);
    const std::vector<std::vector<double>> v25 = v9.p3;
    std::vector<std::vector<double>> v18 = v25;
    v7.p0 = v8;
    const std::vector<double> v31 = v18[0];
    const s1 v52 = f89(v27);
    const std::vector<double> v103 = v25[0];
    const std::vector<std::vector<double>> v29 = v8.p2;
    const double v23 = v103[0];
    std::vector<double> v58 = v31;
    const std::vector<double> v28 = v18[1];
    const std::vector<double> v21 = v29[0];
    v18[1] = v58;
    const std::vector<double> v44 = v25[0];
    v58[0] = v23;
    s0 v50 = v8;
    const double v32 = v28[0];
    v7.p0 = v50;
    std::vector<std::vector<double>> v61 = v25;
    v58[0] = v23;
    v58[0] = v32;
    const std::vector<double> v53 = v29[0];
    const s0 v35 = v5.p1;
    std::vector<std::vector<double>> v36 = v61;
    std::vector<std::vector<double>> v49 = v29;
    const std::vector<double> v34 = v25[1];
    const std::vector<double> v39 { v23, v32, v32, v23, v23, v23 };
    std::vector<double> v65 = v39;
    double v56 = v23;
    v50.p2 = v29;
    std::vector<double> v74 = v39;
    v18[1] = v44;
    v49[0] = v28;
    v7.p0 = v9;
    v18[1] = v31;
    v49[0] = v53;
    const s0 v59 = v52.p0;
    s0 v84 = v59;
    const std::vector<std::vector<double>> v87 = v9.p3;
    const double v193 = v74[2];
    v50.p2 = v49;
    v49[0] = v21;
    const s1 v90(v84, v9);
    v50.p3 = v87;
    v84.p3 = v25;
    const std::vector<std::vector<double>> v166 = v50.p1;
    v65[0] = v193;
    const double v121 = v65[0];
    const std::vector<double> v141 = v166[1];
    const double v85 = v65[4];
    v74[1] = v56;
    const double v62 = v141[0];
    v7.p0 = v10;
    const std::vector<std::vector<double>> v106 = v35.p1;
    v84.p1 = v106;
    double v97 = v121;
    v84.p3 = v36;
    v58 = v34;
    v58[0] = v97;
    v74[1] = v62;
    v58[0] = v85;
    return v90;
  }
  s1 f72(const s1 &v0, const s3 &v1) {
    s3 v5 = v1;
    const std::vector<s1> v2 = v5.p0;
    v5.p0 = v2;
    v5.p0 = v2;
    const std::vector<s1> v4 = v5.p0;
    const s1 v33 = v2[1];
    const s3 v32 = f75(v5);
    const std::vector<s2> v89 = v32.p1;
    const s2 v24 = v89[1];
    std::vector<s2> v20 = v89;
    v20[1] = v24;
    const std::vector<s2> v44 = f84(v5, v20);
    v5.p1 = v44;
    s2 v42 = v24;
    v20[0] = v42;
    const s1 v74 = f89(v33);
    const s1 v176 = f73(v74);
    v5.p0 = v4;
    return v176;
  }
  s1 f46(const s1 &v0) {
    const s1 v7 = f73(v0);
    const s0 v4 = v7.p1;
    const s1 v9(v4, v4);
    const s1 v20 = f89(v9);
    const s1 v41 = f89(v20);
    const s1 v40 = f89(v41);
    const s1 v82 = f80(v40);
    s1 v122 = v82;
    return v122;
  }
  std::vector<s1> f44(const std::vector<s1> &v0) {
    std::vector<s1> v2 = v0;
    const s1 v1 = v0[1];
    v2[0] = v1;
    const s0 v6 = v1.p0;
    s1 v3 = v1;
    const s1 v5 = v0[0];
    const s1 v4 = v2[1];
    const s1 v10 = f46(v3);
    v2[1] = v4;
    v3.p1 = v6;
    v2[1] = v3;
    v3.p1 = v6;
    std::vector<s1> v11 = v2;
    const s0 v25 = v4.p1;
    const s1 v19 = f73(v5);
    const s1 v22 = f89(v10);
    v3.p0 = v25;
    const s1 v68 = f46(v5);
    v11[1] = v3;
    v2[1] = v22;
    const s1 v50 = v0[1];
    v2[0] = v50;
    v3.p1 = v6;
    const s0 v39 = v68.p0;
    v3.p1 = v6;
    v2[1] = v19;
    std::vector<s1> v47 = v11;
    v3.p0 = v25;
    v3.p0 = v39;
    v3.p0 = v25;
    v11 = v2;
    const s1 v42 = v2[1];
    v2[1] = v42;
    v3.p0 = v6;
    return v47;
  }
  std::vector<s1> f20(const std::vector<s1> &v0, const s0 &v1, const s1 &v2) {
    std::vector<s1> v19 = v0;
    return v19;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    s3 v5 = v0;
    const std::vector<s2> v3 = v0.p1;
    const std::vector<s2> v9 = v5.p1;
    s3 v6 = v5;
    v5.p1 = v3;
    const s3 v2 = f75(v0);
    const std::vector<s1> v11 = v5.p0;
    const s1 v12 = v11[0];
    v5.p1 = v9;
    const std::vector<s1> v15 = v6.p0;
    const s1 v16 = v15[1];
    const s1 v18 = f72(v16, v6);
    const s0 v23 = v12.p1;
    v6 = v2;
    const s1 v20 = f72(v16, v2);
    const std::vector<s1> v44 = v5.p0;
    const std::vector<s1> v71 = f44(v11);
    const std::vector<s1> v33 = f20(v11, v23, v20);
    std::vector<s1> v67 = v44;
    const std::vector<std::vector<double>> v30 = v23.p3;
    v67[0] = v12;
    v67[0] = v16;
    v5.p0 = v67;
    v67[1] = v20;
    v67[1] = v18;
    const std::vector<double> v73 = v30[0];
    const double v92 = v73[0];
    v67[1] = v16;
    v5.p0 = v33;
    v5.p0 = v71;
    const s1 v98 = f80(v18);
    v67[0] = v98;
    double v83 = v92;
    return v83;
  }
  int main() {
    s3 v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } }, { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 }, { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } }, { { 16.0 }, { 17.0 } } } }, { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } }, { { 24.0 } }, { { 25.0 }, { 26.0 } } }, { { { 27.0 }, { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 } }, { { 34.0 }, { 35.0 } } } } }, { { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } }, { { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } }, { { 52.0 }, { 53.0 } } } }, { { { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } }, { { 60.0 } }, { { 61.0 }, { 62.0 } } } } } }, { { { { { 63.0 }, { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 } }, { { 70.0 }, { 71.0 } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } }, { { 78.0 } }, { { 79.0 }, { 80.0 } } } }, { { { { { 81.0 }, { 82.0 }, { 83.0 } }, { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 } }, { { 88.0 }, { 89.0 } } } } } } } });
    double v1(90.0);
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
