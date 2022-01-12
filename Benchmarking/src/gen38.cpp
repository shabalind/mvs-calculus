  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<double> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<double> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<double> p1;
    s2(s1 v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s2 p1;
    s3(s1 v0, s2 v1): p0(v0), p1(v1) { }
  };
  s3 f59(const s3 &v0) {
    s3 v4 = v0;
    s3 v6 = v0;
    const s2 v1 = v6.p1;
    s2 v3 = v1;
    const s1 v7 = v3.p0;
    v6 = v4;
    v3.p0 = v7;
    s2 v8 = v1;
    v3.p0 = v7;
    const std::vector<double> v11 = v1.p1;
    s3 v18 = v0;
    v8.p1 = v11;
    v6.p0 = v7;
    v3.p1 = v11;
    s2 v15 = v8;
    const s1 v17 = v15.p0;
    v3.p0 = v7;
    v6.p0 = v17;
    v15.p0 = v17;
    const std::vector<double> v28 = v8.p1;
    v18.p0 = v17;
    v8.p1 = v28;
    v15.p1 = v11;
    v8 = v3;
    const s2 v26 = v0.p1;
    const s2 v38 = v6.p1;
    v18.p0 = v7;
    v18.p0 = v17;
    const s1 v56 = v1.p0;
    v4.p1 = v38;
    v4.p1 = v3;
    v6.p0 = v17;
    v3.p0 = v7;
    v4.p1 = v26;
    s3 v145 = v18;
    v6.p0 = v56;
    v6.p1 = v3;
    return v145;
  }
  s0 f48(const s0 &v0) {
    s0 v3 = v0;
    const std::vector<double> v4 = v0.p2;
    const double v1 = v4[0];
    const std::vector<double> v2 = v0.p2;
    const double v7 = v2[0];
    std::vector<double> v6 = v4;
    std::vector<double> v13 = v6;
    const std::vector<double> v5 = v0.p2;
    const std::vector<std::vector<double>> v10 = v3.p3;
    double v11 = v1;
    const double v8 = v2[2];
    std::vector<std::vector<double>> v9 = v10;
    const std::vector<std::vector<double>> v17 = v0.p0;
    const std::vector<double> v15 = v10[0];
    v3.p3 = v9;
    const std::vector<double> v30 = v9[0];
    v13[2] = v1;
    const std::vector<double> v25 = v10[0];
    const s0 v14(v17, v17, v5, v10);
    v13[2] = v8;
    std::vector<std::vector<double>> v22 = v17;
    const double v20 = v13[2];
    v3.p2 = v5;
    v22[0] = v25;
    const std::vector<double> v18 = v22[0];
    v6[0] = v20;
    v3.p3 = v9;
    double v38 = v7;
    const std::vector<std::vector<double>> v21 = v14.p0;
    v3.p1 = v21;
    const std::vector<double> v12 = v14.p2;
    v9[0] = v15;
    v3.p2 = v12;
    const std::vector<std::vector<double>> v61 = v0.p0;
    const std::vector<std::vector<double>> v36 = v14.p3;
    v3.p1 = v17;
    v6[0] = v11;
    const std::vector<std::vector<double>> v55 = v3.p1;
    v3.p0 = v21;
    std::vector<double> v42 = v5;
    v3.p1 = v17;
    v13[1] = v38;
    v6[1] = v8;
    v3.p3 = v36;
    const std::vector<double> v47 = v22[0];
    v22[1] = v47;
    v22[1] = v47;
    v42[1] = v20;
    v22 = v55;
    const std::vector<std::vector<double>> v43 = v3.p3;
    const s0 v161(v21, v61, v42, v43);
    v9[0] = v30;
    v3.p3 = v10;
    v22[0] = v15;
    v9[0] = v18;
    return v161;
  }
  s1 f40(const s1 &v0) {
    return v0;
  }
  s3 f26(const s3 &v0) {
    const std::vector<s3> v3 { v0, v0 };
    const s1 v8 = v0.p0;
    const s3 v4 = f59(v0);
    s1 v10 = v8;
    s3 v7 = v4;
    const s3 v1 = f59(v7);
    v7.p0 = v10;
    std::vector<s3> v5 = v3;
    const s3 v9 = v5[1];
    const std::vector<s0> v14 = v10.p1;
    v10.p1 = v14;
    v5[0] = v9;
    const s3 v18 = f59(v9);
    s1 v11 = v10;
    const std::vector<s0> v17 = v11.p1;
    const s3 v35 = f59(v0);
    const s3 v13 = v5[0];
    std::vector<s3> v28 = v5;
    const s0 v53 = v17[1];
    const s3 v70 = v5[0];
    v28[1] = v18;
    const s2 v40 = v1.p1;
    v28[0] = v7;
    const s3 v34 = f59(v35);
    v28[1] = v0;
    const s3 v77 = v28[1];
    v10.p0 = v53;
    const s0 v54 = f48(v53);
    v11.p0 = v54;
    v7.p1 = v40;
    std::vector<s3> v56 = v3;
    const s3 v81 = f59(v13);
    v56[1] = v81;
    const s3 v143 = f59(v77);
    const s2 v144 = v34.p1;
    v56[0] = v70;
    const s3 v227 = v56[0];
    v28[1] = v227;
    v7.p1 = v144;
    v5[1] = v0;
    return v143;
  }
  s3 f1(const s3 &v0) {
    const s3 v8 = f26(v0);
    const s2 v2 = v0.p1;
    const s2 v4 = v8.p1;
    s2 v5 = v2;
    const s3 v3 = f26(v8);
    s3 v13 = v3;
    v13.p1 = v2;
    v13.p1 = v5;
    v13.p1 = v5;
    const s1 v16 = v4.p0;
    s1 v23 = v16;
    v5.p0 = v16;
    s1 v25 = v23;
    v5.p0 = v25;
    const std::vector<s0> v30 = v16.p1;
    v5.p0 = v23;
    const s1 v39 = f40(v25);
    const s3 v54 = f26(v13);
    const s3 v63 = f26(v54);
    v25.p1 = v30;
    const s1 v99 = f40(v39);
    v13.p0 = v99;
    const s3 v118 = f26(v63);
    return v118;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const std::vector<s1> &v1, const double &v2) {
    const s1 v5 = v1[1];
    const s1 v12 = v1[0];
    s3 v9 = v0;
    const s1 v4 = v1[0];
    const s1 v7 = v1[1];
    v9.p0 = v5;
    std::vector<s1> v16 = v1;
    const s1 v11 = v16[0];
    const s3 v22 = f26(v9);
    v9.p0 = v7;
    const std::vector<s0> v25 = v7.p1;
    v16[1] = v12;
    const s1 v21 = v22.p0;
    const s1 v28 = v16[1];
    const s0 v15 = v25[0];
    v9.p0 = v12;
    const s0 v19 = f48(v15);
    const s1 v33(v15, v25);
    v16[0] = v21;
    v9.p0 = v33;
    const s3 v49 = f1(v9);
    v9.p0 = v11;
    v9.p0 = v21;
    v16[1] = v28;
    const s2 v44 = v49.p1;
    double v65 = v2;
    const std::vector<std::vector<double>> v54 = v19.p1;
    const std::vector<double> v71 = v54[0];
    const std::vector<double> v164 = v44.p1;
    const double v52 = v71[0];
    const double v66 = v52 - v65;
    const double v92 = v164[0];
    const double v220 = v92 - v66;
    v16[0] = v4;
    return v220;
  }
  int main() {
    s3 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } }, { 4.0, 5.0, 6.0 }, { { 7.0 } } }, { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } }, { 12.0, 13.0, 14.0 }, { { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } }, { 20.0, 21.0, 22.0 }, { { 23.0 } } }, { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } }, { 28.0, 29.0, 30.0 }, { { 31.0 } } } } }, { { { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } }, { 36.0, 37.0, 38.0 }, { { 39.0 } } }, { { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } }, { 44.0, 45.0, 46.0 }, { { 47.0 } } }, { { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } }, { 52.0, 53.0, 54.0 }, { { 55.0 } } }, { { { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } }, { 60.0, 61.0, 62.0 }, { { 63.0 } } } } }, { 64.0, 65.0, 66.0 } } });
    std::vector<s1> v1({ { { { { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 } }, { 71.0, 72.0, 73.0 }, { { 74.0 } } }, { { { { 75.0 }, { 76.0 } }, { { 77.0 }, { 78.0 } }, { 79.0, 80.0, 81.0 }, { { 82.0 } } }, { { { 83.0 }, { 84.0 } }, { { 85.0 }, { 86.0 } }, { 87.0, 88.0, 89.0 }, { { 90.0 } } }, { { { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 } }, { 95.0, 96.0, 97.0 }, { { 98.0 } } } } }, { { { { 99.0 }, { 100.0 } }, { { 101.0 }, { 102.0 } }, { 103.0, 104.0, 105.0 }, { { 106.0 } } }, { { { { 107.0 }, { 108.0 } }, { { 109.0 }, { 110.0 } }, { 111.0, 112.0, 113.0 }, { { 114.0 } } }, { { { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 } }, { 119.0, 120.0, 121.0 }, { { 122.0 } } }, { { { 123.0 }, { 124.0 } }, { { 125.0 }, { 126.0 } }, { 127.0, 128.0, 129.0 }, { { 130.0 } } } } } });
    double v2(131.0);
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
