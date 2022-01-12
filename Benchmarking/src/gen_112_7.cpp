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
    s0 p2;
    s1(std::vector<s0> v0, s0 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    std::vector<std::vector<s1>> p0;
    std::vector<s0> p1;
    s2(std::vector<std::vector<s1>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s2 p0;
    s2 p1;
    s4(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  s2 f45(const s2 &v0) {
    const std::vector<s0> v5 = v0.p1;
    const std::vector<std::vector<s1>> v7 = v0.p0;
    const std::vector<s0> v6 = v0.p1;
    const s0 v2 = v6[0];
    const std::vector<s1> v8 = v7[0];
    s2 v11 = v0;
    std::vector<s0> v13 = v5;
    s2 v10 = v11;
    const std::vector<std::vector<double>> v17 = v2.p1;
    v10 = v0;
    std::vector<s0> v15 = v13;
    v10.p1 = v6;
    v10.p1 = v15;
    s0 v19 = v2;
    const s0 v27 = v13[0];
    s0 v32 = v27;
    const s1 v20 = v8[0];
    const std::vector<std::vector<double>> v26 = v27.p0;
    const std::vector<std::vector<s1>> v21 = v0.p0;
    v19.p0 = v26;
    const std::vector<std::vector<double>> v47 = v19.p0;
    const std::vector<std::vector<double>> v60 = v19.p1;
    std::vector<std::vector<double>> v44 = v60;
    v19.p1 = v44;
    v13 = v15;
    v32.p0 = v47;
    const s0 v56 = v20.p1;
    const std::vector<std::vector<double>> v63 = v56.p1;
    const std::vector<double> v35 = v17[2];
    v44[1] = v35;
    s2 v78 = v10;
    v10.p0 = v21;
    v19.p0 = v47;
    v19.p1 = v63;
    v11.p0 = v7;
    v15[0] = v32;
    v32 = v27;
    return v78;
  }
  double f44(const double &v0, const s2 &v1) {
    const s2 v2 = f45(v1);
    const std::vector<std::vector<s1>> v3 = v2.p0;
    const std::vector<s1> v14 = v3[2];
    const s1 v40 = v14[0];
    const s0 v30 = v40.p2;
    const std::vector<std::vector<double>> v56 = v30.p1;
    const std::vector<double> v60 = v56[0];
    std::vector<double> v38 = v60;
    const double v46 = v38[0];
    return v46;
  }
  s2 f41(const s2 &v0, const s1 &v1, const s0 &v2, const s1 &v3) {
    const s2 v7 = f45(v0);
    const s2 v4 = f45(v7);
    const s2 v15 = f45(v4);
    s2 v14 = v15;
    s0 v13 = v2;
    const std::vector<std::vector<s1>> v24 = v7.p0;
    const std::vector<s0> v40 = v14.p1;
    std::vector<s0> v37 = v40;
    std::vector<s0> v49 = v37;
    v37[0] = v2;
    const s2 v44 = f45(v7);
    std::vector<std::vector<s1>> v75 = v24;
    v14.p0 = v75;
    const std::vector<std::vector<s1>> v73 = v44.p0;
    v49[0] = v13;
    std::vector<std::vector<s1>> v64 = v73;
    const s2 v94(v75, v49);
    const std::vector<s1> v116 = v75[2];
    v64[2] = v116;
    v14 = v7;
    v14.p0 = v64;
    return v94;
  }
  s2 f27(const s2 &v0) {
    const s2 v7 = f45(v0);
    const std::vector<s0> v1 = v0.p1;
    const std::vector<std::vector<s1>> v6 = v7.p0;
    const s2 v4 = f45(v7);
    const s2 v11 = f45(v0);
    const std::vector<std::vector<s1>> v14 = v4.p0;
    const s0 v13 = v1[0];
    const std::vector<s1> v15 = v6[1];
    const s1 v18 = v15[0];
    const std::vector<std::vector<s1>> v20 = v11.p0;
    const std::vector<s1> v19 = v20[0];
    s2 v40 = v11;
    v40.p0 = v6;
    v40.p0 = v14;
    const s0 v62 = v1[0];
    s1 v71 = v18;
    const s1 v46 = v19[0];
    v71.p1 = v62;
    const s2 v48 = f41(v40, v71, v13, v46);
    return v48;
  }
  s4 f4(const s4 &v0) {
    s4 v5 = v0;
    const s2 v1 = v5.p1;
    v5.p1 = v1;
    v5.p1 = v1;
    v5.p1 = v1;
    const s4 v2(v1, v1);
    v5 = v2;
    s4 v13 = v0;
    const s2 v9 = f27(v1);
    v5.p0 = v1;
    s2 v11 = v9;
    const std::vector<s0> v19 = v9.p1;
    s2 v16 = v11;
    const s2 v14 = f27(v16);
    v5.p0 = v14;
    const s2 v47 = f27(v16);
    s2 v51 = v16;
    const s2 v28 = f45(v51);
    const s2 v72 = v13.p1;
    v13 = v2;
    const s4 v42(v51, v47);
    v16.p1 = v19;
    v5.p0 = v28;
    v5.p0 = v72;
    v5.p1 = v72;
    return v42;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const double &v1) {
    const s2 v2 = v0.p0;
    s4 v5 = v0;
    const s2 v11 = f45(v2);
    s2 v9 = v2;
    const std::vector<std::vector<s1>> v10 = v2.p0;
    const std::vector<s1> v17 = v10[1];
    const std::vector<s0> v4 = v11.p1;
    v9.p0 = v10;
    const std::vector<s0> v12 = v11.p1;
    const s2 v21 = f45(v9);
    const s1 v15 = v17[0];
    v9.p0 = v10;
    v9.p1 = v12;
    const s2 v16 = v5.p1;
    const s4 v36(v16, v11);
    const s2 v31(v10, v4);
    const s4 v49 = f4(v36);
    v9 = v31;
    const s0 v32 = v15.p1;
    const s2 v35 = v49.p0;
    const std::vector<std::vector<double>> v52 = v32.p0;
    v5.p1 = v31;
    v9.p0 = v10;
    const std::vector<double> v93 = v52[0];
    v5.p1 = v2;
    const double v81 = v93[0];
    const double v102 = f44(v81, v35);
    v5.p0 = v21;
    v9 = v31;
    return v102;
  }
  int main() {
    s4 v0({ { { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } } }, { { { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } }, { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } } } }, { { { { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } }, { { { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } } } }, { { { 65.0 }, { 66.0 } }, { { 67.0 }, { 68.0 }, { 69.0 } } }, { { { 70.0 }, { 71.0 } }, { { 72.0 }, { 73.0 }, { 74.0 } } } } } }, { { { { 75.0 }, { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } } }, { { { { { { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 }, { 84.0 } } }, { { { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } }, { { { 90.0 }, { 91.0 } }, { { 92.0 }, { 93.0 }, { 94.0 } } } }, { { { 95.0 }, { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } }, { { { 100.0 }, { 101.0 } }, { { 102.0 }, { 103.0 }, { 104.0 } } } } }, { { { { { { 105.0 }, { 106.0 } }, { { 107.0 }, { 108.0 }, { 109.0 } } }, { { { 110.0 }, { 111.0 } }, { { 112.0 }, { 113.0 }, { 114.0 } } }, { { { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } }, { { { 120.0 }, { 121.0 } }, { { 122.0 }, { 123.0 }, { 124.0 } } }, { { { 125.0 }, { 126.0 } }, { { 127.0 }, { 128.0 }, { 129.0 } } } } }, { { { { { { 130.0 }, { 131.0 } }, { { 132.0 }, { 133.0 }, { 134.0 } } }, { { { 135.0 }, { 136.0 } }, { { 137.0 }, { 138.0 }, { 139.0 } } }, { { { 140.0 }, { 141.0 } }, { { 142.0 }, { 143.0 }, { 144.0 } } } }, { { { 145.0 }, { 146.0 } }, { { 147.0 }, { 148.0 }, { 149.0 } } }, { { { 150.0 }, { 151.0 } }, { { 152.0 }, { 153.0 }, { 154.0 } } } } } }, { { { { 155.0 }, { 156.0 } }, { { 157.0 }, { 158.0 }, { 159.0 } } } } } });
    double v1(160.0);
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
