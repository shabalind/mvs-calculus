  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s1 p1;
    s3(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  std::vector<double> f93(const std::vector<double> &v0) {
    const double v6 = v0[0];
    const double v4 = v6 * v6;
    std::vector<double> v5 = v0;
    v5[0] = v4;
    return v5;
  }
  s0 f89(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    std::vector<std::vector<double>> v6 = v5;
    const std::vector<std::vector<double>> v2 = v0.p0;
    const std::vector<double> v7 = v5[1];
    const double v4 = v7[0];
    std::vector<std::vector<double>> v10 = v2;
    v10[0] = v7;
    v10[1] = v7;
    v10[0] = v7;
    v6[1] = v7;
    std::vector<double> v18 = v7;
    const std::vector<double> v3 = v0.p1;
    v10[0] = v18;
    v18[0] = v4;
    const std::vector<double> v13 = f93(v18);
    const std::vector<double> v31 = f93(v13);
    const std::vector<double> v26 = v6[0];
    const double v51 = v26[0];
    v18[0] = v51;
    const s0 v65(v10, v3);
    v10[1] = v31;
    return v65;
  }
  double f6(const double &v0) {
    double v2 = v0;
    double v5 = v0;
    double v3 = v0;
    double v9 = v5;
    double v1 = v3;
    double v6 = v0;
    double v8 = v6;
    const double v18 = v8 * v2;
    double v14 = v1;
    const std::vector<double> v17 { v2, v2, v18, v14, v9 };
    std::vector<double> v16 = v17;
    v16[4] = v9;
    std::vector<double> v25 = v17;
    const double v40 = v17[1];
    const double v12 = v25[1];
    std::vector<double> v31 = v17;
    const std::vector<std::vector<double>> v22 { v17, v17, v31, v25 };
    std::vector<std::vector<double>> v41 = v22;
    v16[4] = v6;
    double v27 = v5;
    v41[3] = v16;
    const std::vector<double> v26 = v41[3];
    const std::vector<double> v60 = v41[2];
    std::vector<double> v38 = v60;
    v38[1] = v0;
    std::vector<std::vector<double>> v28 = v41;
    std::vector<std::vector<double>> v47 = v22;
    const std::vector<double> v65 = v47[0];
    const double v43 = v38[3];
    const std::vector<double> v52 = v28[0];
    double v34 = v12;
    std::vector<double> v51 = v16;
    std::vector<double> v56 = v60;
    const double v121 = v52[4];
    double v54 = v40;
    v25[3] = v43;
    v51[1] = v34;
    v25[3] = v27;
    v41[0] = v65;
    v56[2] = v18;
    double v61 = v40;
    v41[0] = v26;
    const double v106 = v121 + v27;
    v25[4] = v12;
    v16[0] = v54;
    v47[3] = v51;
    v28[2] = v38;
    v41[3] = v56;
    v25[4] = v61;
    return v106;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s3>> &v0, const std::vector<std::vector<s2>> &v1, const std::vector<std::vector<s2>> &v2, const s0 &v3, const double &v4) {
    const std::vector<s0> v6 { v3, v3, v3, v3, v3, v3 };
    const double v7 = f6(v4);
    const s0 v13 = f89(v3);
    const s0 v10 = v6[4];
    const s0 v28 = f89(v13);
    const std::vector<std::vector<double>> v37 = v28.p0;
    const std::vector<double> v31 = v37[1];
    const std::vector<double> v25 = v10.p1;
    std::vector<double> v23 = v31;
    const double v59 = v7 - v4;
    v23[0] = v4;
    const double v41 = v23[0];
    const double v55 = v25[1];
    double v108 = v55;
    const double v102 = v59 - v108;
    v108 = v41;
    v23[0] = v102;
    const double v467 = v55 - v102;
    return v467;
  }
  int main() {
    std::vector<std::vector<s3>> v0({ { { { { { { { { { 0.0 }, { 1.0 } }, { 2.0, 3.0, 4.0 } } }, { { { { 5.0 }, { 6.0 } }, { 7.0, 8.0, 9.0 } } }, { { { { 10.0 }, { 11.0 } }, { 12.0, 13.0, 14.0 } } } }, { { { 15.0 }, { 16.0 } }, { 17.0, 18.0, 19.0 } } }, { { { { { { 20.0 }, { 21.0 } }, { 22.0, 23.0, 24.0 } } }, { { { { 25.0 }, { 26.0 } }, { 27.0, 28.0, 29.0 } } }, { { { { 30.0 }, { 31.0 } }, { 32.0, 33.0, 34.0 } } } }, { { { 35.0 }, { 36.0 } }, { 37.0, 38.0, 39.0 } } } }, { { { { { { 40.0 }, { 41.0 } }, { 42.0, 43.0, 44.0 } } }, { { { { 45.0 }, { 46.0 } }, { 47.0, 48.0, 49.0 } } }, { { { { 50.0 }, { 51.0 } }, { 52.0, 53.0, 54.0 } } } }, { { { 55.0 }, { 56.0 } }, { 57.0, 58.0, 59.0 } } } } } });
    std::vector<std::vector<s2>> v1({ { { { { { { 60.0 }, { 61.0 } }, { 62.0, 63.0, 64.0 } }, { { { 65.0 }, { 66.0 } }, { 67.0, 68.0, 69.0 } } }, { { { 70.0 }, { 71.0 } }, { 72.0, 73.0, 74.0 } } } }, { { { { { { 75.0 }, { 76.0 } }, { 77.0, 78.0, 79.0 } }, { { { 80.0 }, { 81.0 } }, { 82.0, 83.0, 84.0 } } }, { { { 85.0 }, { 86.0 } }, { 87.0, 88.0, 89.0 } } } } });
    std::vector<std::vector<s2>> v2({ { { { { { { 90.0 }, { 91.0 } }, { 92.0, 93.0, 94.0 } }, { { { 95.0 }, { 96.0 } }, { 97.0, 98.0, 99.0 } } }, { { { 100.0 }, { 101.0 } }, { 102.0, 103.0, 104.0 } } } }, { { { { { { 105.0 }, { 106.0 } }, { 107.0, 108.0, 109.0 } }, { { { 110.0 }, { 111.0 } }, { 112.0, 113.0, 114.0 } } }, { { { 115.0 }, { 116.0 } }, { 117.0, 118.0, 119.0 } } } }, { { { { { { 120.0 }, { 121.0 } }, { 122.0, 123.0, 124.0 } }, { { { 125.0 }, { 126.0 } }, { 127.0, 128.0, 129.0 } } }, { { { 130.0 }, { 131.0 } }, { 132.0, 133.0, 134.0 } } } } });
    s0 v3({ { { 135.0 }, { 136.0 } }, { 137.0, 138.0, 139.0 } });
    double v4(140.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
