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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s2 p1;
    s3(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s1 p0;
    s3 p1;
    s7(s1 v0, s3 v1): p0(v0), p1(v1) { }
  };
  struct s11 {
    double p0;
    s3 p1;
    s11(double v0, s3 v1): p0(v0), p1(v1) { }
  };
  s1 f89(const s1 &v0) {
    const std::vector<s0> v6 = v0.p1;
    const std::vector<s0> v2 = v0.p0;
    std::vector<s0> v8 = v2;
    const std::vector<s0> v4 = v0.p0;
    const s0 v13 = v6[2];
    const std::vector<std::vector<double>> v12 = v13.p0;
    const std::vector<std::vector<double>> v7 = v13.p0;
    const std::vector<std::vector<double>> v9 = v13.p0;
    const std::vector<std::vector<double>> v14 = v13.p1;
    s0 v20 = v13;
    const std::vector<std::vector<double>> v15 = v20.p0;
    std::vector<std::vector<double>> v19 = v14;
    v20.p1 = v14;
    const std::vector<std::vector<double>> v37 = v13.p0;
    s1 v48 = v0;
    v8[1] = v20;
    v8 = v6;
    const std::vector<s0> v60 = v0.p1;
    const std::vector<std::vector<std::vector<double>>> v38 { v37, v15, v9, v7, v37 };
    v8 = v4;
    v48.p0 = v60;
    const std::vector<std::vector<double>> v26 = v38[3];
    const std::vector<std::vector<double>> v42 = v20.p0;
    v20.p0 = v42;
    const s0 v67(v12, v19);
    v48.p1 = v8;
    v48.p1 = v8;
    v8[1] = v67;
    v20.p0 = v26;
    return v48;
  }
  s7 f68(const s7 &v0) {
    return v0;
  }
  s0 f61(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<double> v1 = v4[2];
    const std::vector<std::vector<double>> v2 = v0.p1;
    const std::vector<std::vector<std::vector<double>>> v8 { v4, v4, v4 };
    const std::vector<std::vector<double>> v7 = v8[1];
    const std::vector<double> v3 = v4[0];
    const std::vector<std::vector<double>> v9 = v0.p0;
    const std::vector<std::vector<double>> v13 = v0.p0;
    std::vector<std::vector<double>> v6 = v2;
    std::vector<std::vector<std::vector<double>>> v16 = v8;
    const s0 v14(v4, v2);
    const std::vector<double> v15 = v13[2];
    std::vector<std::vector<double>> v18 = v6;
    std::vector<std::vector<double>> v19 = v6;
    const std::vector<std::vector<double>> v28 = v0.p1;
    std::vector<std::vector<double>> v17 = v4;
    const s0 v23(v9, v2);
    const std::vector<double> v51 = v28[0];
    const std::vector<std::vector<double>> v30 = v14.p0;
    const std::vector<std::vector<double>> v48 = v23.p1;
    v17[0] = v1;
    v16[2] = v13;
    v18 = v19;
    const std::vector<double> v47 = v48[0];
    const std::vector<std::vector<double>> v74 = v14.p1;
    v17[2] = v1;
    v17[2] = v47;
    const s0 v50(v30, v6);
    v19[0] = v51;
    v17[2] = v3;
    std::vector<std::vector<double>> v27 = v74;
    const std::vector<std::vector<double>> v39 = v23.p0;
    const std::vector<std::vector<double>> v42 = v50.p0;
    v17 = v7;
    s0 v33 = v14;
    const std::vector<double> v60 = v6[0];
    v33.p0 = v9;
    v33.p1 = v6;
    v33.p1 = v18;
    const std::vector<std::vector<double>> v32 = v33.p0;
    const std::vector<double> v72 = v32[1];
    v16[0] = v17;
    v16[1] = v39;
    v33.p0 = v42;
    v19[0] = v3;
    v27[0] = v60;
    v19[0] = v1;
    v19[0] = v72;
    const std::vector<std::vector<double>> v91 = v16[2];
    v16[1] = v9;
    v18[0] = v15;
    v33.p1 = v74;
    v33.p0 = v17;
    v17[1] = v1;
    const s0 v258(v32, v27);
    v17 = v91;
    return v258;
  }
  s7 f27(const s1 &v0, const s7 &v1) {
    const s1 v6 = v1.p0;
    const s7 v4 = f68(v1);
    const s1 v7 = v1.p0;
    const s7 v9 = f68(v4);
    s7 v2 = v4;
    s1 v12 = v7;
    const s1 v11 = f89(v12);
    const std::vector<s0> v14 = v6.p0;
    v12.p0 = v14;
    const s1 v10 = f89(v11);
    const s0 v16 = v14[2];
    const s0 v22 = f61(v16);
    s1 v17 = v10;
    const s0 v27 = v14[2];
    v12.p1 = v14;
    const s0 v20 = v14[0];
    s0 v18 = v16;
    const s0 v13 = v14[1];
    const s1 v26 = v2.p0;
    std::vector<s0> v28 = v14;
    const s0 v43 = f61(v18);
    const s0 v50 = f61(v43);
    const std::vector<std::vector<double>> v19 = v43.p1;
    const s0 v71 = v28[1];
    s0 v29 = v50;
    s7 v30 = v2;
    v28[1] = v50;
    const s3 v35 = v1.p1;
    v29.p1 = v19;
    v28[1] = v13;
    v17.p1 = v14;
    v28[0] = v18;
    s3 v48 = v35;
    v17.p1 = v28;
    const s3 v102 = v2.p1;
    v30.p0 = v17;
    s0 v32 = v71;
    v28[1] = v29;
    v28[0] = v43;
    v32.p1 = v19;
    v28[0] = v22;
    v28[0] = v20;
    v30.p1 = v48;
    v28[0] = v16;
    v18.p1 = v19;
    v28[1] = v27;
    v28[2] = v20;
    v12.p1 = v14;
    v28[2] = v32;
    const std::vector<s0> v91 = v26.p1;
    v17.p0 = v28;
    v17.p1 = v14;
    v30.p0 = v17;
    v17.p1 = v91;
    v2.p1 = v102;
    v30 = v9;
    return v30;
  }
  s11 f12(const double &v0, const s11 &v1) {
    const double v7 = v1.p0;
    s11 v6 = v1;
    v6.p0 = v0;
    v6.p0 = v0;
    v6.p0 = v7;
    const s3 v4 = v6.p1;
    v6.p1 = v4;
    const std::vector<double> v3 { v0, v0, v0, v0 };
    v6 = v1;
    const double v11 = v3[2];
    const double v26 = v3[2];
    s11 v16 = v6;
    v16.p0 = v11;
    v6.p0 = v26;
    const s11 v85(v0, v4);
    s3 v61 = v4;
    v16 = v85;
    v6.p0 = v7;
    v6.p0 = v7;
    v16.p1 = v61;
    return v16;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const std::vector<s7> &v1, const double &v2) {
    const s7 v4 = v1[0];
    const double v6 = v2 + v2;
    const s7 v11 = f68(v4);
    s1 v12 = v0;
    const s7 v29 = f27(v12, v11);
    const s3 v25 = v29.p1;
    const s11 v36(v6, v25);
    const s11 v43 = f12(v6, v36);
    const double v39 = v43.p0;
    const double v45 = v39 + v2;
    const double v35 = v45 + v39;
    return v35;
  }
  int main() {
    s1 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } });
    std::vector<s7> v1({ { { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } }, { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } } }, { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } }, { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } } } }, { { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } }, { { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } } }, { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } } } } } }, { { { { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 } } }, { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 } } } }, { { { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 } } }, { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 } } }, { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 } } } } }, { { { { { 88.0 }, { 89.0 }, { 90.0 } }, { { 91.0 } } }, { { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 } } } } }, { { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 } } }, { { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 } } } } } } }, { { { { { { 104.0 }, { 105.0 }, { 106.0 } }, { { 107.0 } } }, { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 } } }, { { { 112.0 }, { 113.0 }, { 114.0 } }, { { 115.0 } } } }, { { { { 116.0 }, { 117.0 }, { 118.0 } }, { { 119.0 } } }, { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 } } }, { { { 124.0 }, { 125.0 }, { 126.0 } }, { { 127.0 } } } } }, { { { { { 128.0 }, { 129.0 }, { 130.0 } }, { { 131.0 } } }, { { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 } } } } }, { { { { 136.0 }, { 137.0 }, { 138.0 } }, { { 139.0 } } }, { { { { 140.0 }, { 141.0 }, { 142.0 } }, { { 143.0 } } } } } } } });
    double v2(144.0);
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
