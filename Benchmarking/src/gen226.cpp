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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f12(const s0 &v0) {
    s0 v6 = v0;
    const std::vector<std::vector<double>> v8 = v6.p1;
    const std::vector<std::vector<double>> v2 = v0.p0;
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<std::vector<double>> v5 = v6.p0;
    const std::vector<double> v7 = v2[1];
    const std::vector<std::vector<double>> v1 = v0.p1;
    std::vector<std::vector<double>> v12 = v5;
    const std::vector<std::vector<double>> v16 = v6.p0;
    const std::vector<std::vector<double>> v11 = v6.p1;
    const std::vector<double> v13 = v1[0];
    std::vector<double> v14 = v7;
    const std::vector<std::vector<double>> v9 = v6.p0;
    v12[1] = v13;
    s0 v10 = v0;
    v10.p1 = v8;
    std::vector<std::vector<double>> v15 = v3;
    const std::vector<double> v28 = v5[0];
    v12 = v16;
    v12[1] = v14;
    std::vector<std::vector<double>> v21 = v2;
    v10.p1 = v15;
    v10.p0 = v9;
    v6.p1 = v1;
    v12[1] = v28;
    s0 v35 = v10;
    v10.p0 = v12;
    v35.p1 = v3;
    v10.p0 = v21;
    v21[1] = v7;
    const std::vector<std::vector<double>> v37 = v35.p0;
    v35.p1 = v11;
    const std::vector<std::vector<double>> v54 = v0.p1;
    const std::vector<std::vector<double>> v36 = v10.p1;
    const s0 v109(v37, v54);
    v35.p1 = v11;
    v10.p1 = v36;
    return v109;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const s1 &v1, const std::vector<std::vector<s1>> &v2, const s0 &v3, const double &v4) {
    const std::vector<std::vector<double>> v9 = v3.p0;
    const s0 v10 = v1.p0;
    s0 v5 = v3;
    const s0 v7 = f12(v5);
    v5.p0 = v9;
    const std::vector<std::vector<double>> v23 = v10.p1;
    const s0 v14 = v1.p0;
    s0 v30 = v5;
    const std::vector<std::vector<double>> v25 = v30.p1;
    const std::vector<std::vector<double>> v37 = v14.p1;
    v5.p0 = v9;
    const s0 v59 = v1.p0;
    v5.p1 = v37;
    const s0 v41(v9, v37);
    const std::vector<std::vector<double>> v64 = v10.p1;
    const std::vector<std::vector<double>> v73 = v59.p1;
    v5.p0 = v9;
    const std::vector<std::vector<std::vector<double>>> v49 { v73, v23, v37, v23, v23, v64, v73 };
    const std::vector<std::vector<double>> v67 = v49[2];
    v5 = v7;
    std::vector<std::vector<double>> v110 = v37;
    v30.p1 = v67;
    const std::vector<std::vector<double>> v173 = v41.p0;
    const std::vector<double> v235 = v25[2];
    v110[0] = v235;
    const double v231 = v235[0];
    v5.p0 = v173;
    v30.p0 = v9;
    v5.p1 = v110;
    return v231;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } } });
    s1 v1({ { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } } });
    std::vector<std::vector<s1>> v2({ { { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } }, { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } } } } }, { { { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } }, { { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } }, { { { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } } } } } }, { { { { { 65.0 }, { 66.0 } }, { { 67.0 }, { 68.0 }, { 69.0 } } }, { { { { 70.0 }, { 71.0 } }, { { 72.0 }, { 73.0 }, { 74.0 } } }, { { { 75.0 }, { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } }, { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 }, { 84.0 } } } } } } });
    s0 v3({ { { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } });
    double v4(90.0);
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
