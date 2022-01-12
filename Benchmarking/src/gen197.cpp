  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s1 p1;
    s2(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    std::vector<std::vector<s0>> p1;
    s3(s1 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s2>> p0;
    std::vector<s3> p1;
    s4(std::vector<std::vector<s2>> v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s4 p0;
    s6(s4 v0): p0(v0) { }
  };
  std::vector<double> f101(const std::vector<double> &v0) {
    std::vector<double> v3 = v0;
    std::vector<double> v7 = v0;
    const double v2 = v7[1];
    v7[0] = v2;
    const double v8 = v7[1];
    v3[0] = v2;
    const double v6 = v3[2];
    v3 = v0;
    v3[1] = v6;
    v3 = v0;
    double v10 = v8;
    std::vector<double> v9 = v3;
    double v11 = v10;
    v7[0] = v8;
    std::vector<double> v12 = v0;
    const double v21 = v2 + v11;
    v3[1] = v21;
    v11 = v6;
    const double v23 = v0[0];
    const double v29 = v3[1];
    double v17 = v23;
    const double v15 = v7[1];
    v12[2] = v15;
    const std::vector<std::vector<double>> v39 { v9 };
    std::vector<std::vector<double>> v35 = v39;
    v35[0] = v9;
    std::vector<double> v43 = v7;
    const std::vector<std::vector<std::vector<double>>> v24 { v35, v39, v35, v35, v35, v35 };
    double v53 = v29;
    std::vector<std::vector<std::vector<double>>> v36 = v24;
    const std::vector<std::vector<double>> v31 = v36[0];
    std::vector<std::vector<double>> v38 = v31;
    const std::vector<std::vector<double>> v57 = v24[3];
    v38 = v31;
    v3[1] = v17;
    v12[1] = v8;
    const std::vector<double> v111 = v38[0];
    std::vector<double> v51 = v43;
    v38[0] = v12;
    v35[0] = v51;
    v12[1] = v53;
    v36[4] = v57;
    return v111;
  }
  double f51(const double &v0) {
    double v2 = v0;
    v2 = v0;
    double v7 = v2;
    const double v1 = v7 * v0;
    const double v5 = v7 + v1;
    const std::vector<double> v15 { v5 };
    std::vector<double> v18 = v15;
    const double v9 = v15[0];
    const double v13 = v18[0];
    v18[0] = v9;
    std::vector<double> v12 = v18;
    double v23 = v13;
    v18[0] = v23;
    std::vector<double> v17 = v12;
    const std::vector<std::vector<double>> v24 { v12, v17 };
    const double v67 = v18[0];
    const std::vector<double> v19 = v24[0];
    const double v42 = v19[0];
    v17[0] = v67;
    v12[0] = v1;
    return v42;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const s6 &v1, const double &v2) {
    double v5 = v2;
    double v17 = v2;
    double v16 = v17;
    const double v12 = f51(v16);
    const std::vector<double> v26 { v2, v2, v17 };
    const double v69 = f51(v5);
    const std::vector<double> v61 = f101(v26);
    const double v56 = v12 * v2;
    std::vector<double> v46 = v61;
    v46[0] = v12;
    const double v31 = v16 / v56;
    const double v50 = v46[0];
    v16 = v69;
    v16 = v31;
    return v50;
  }
  int main() {
    s4 v0({ { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } } } } }, { { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } } }, { { { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } } } }, { { { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } }, { { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } } } }, { { { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } } }, { { { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } } } } } });
    s6 v1({ { { { { { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } }, { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 } } } }, { { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 } } }, { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 } } } } } } }, { { { { { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 } } }, { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 } } } }, { { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 } } } } } }, { { { { { 88.0 }, { 89.0 }, { 90.0 } }, { { 91.0 } } }, { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 } } } }, { { { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 } } } } } }, { { { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 } } }, { { { 104.0 }, { 105.0 }, { 106.0 } }, { { 107.0 } } } }, { { { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 } } } } } } } } });
    double v2(112.0);
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
