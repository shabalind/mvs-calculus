  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<std::vector<s1>> p1;
    s2(std::vector<s1> v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s2 p1;
    s2 p2;
    s3(std::vector<s1> v0, s2 v1, s2 v2): p0(v0), p1(v1), p2(v2) { }
  };
  s3 f51(const s3 &v0) {
    const s2 v6 = v0.p1;
    const std::vector<s1> v5 = v0.p0;
    const std::vector<s2> v8 { v6, v6, v6, v6, v6, v6 };
    const std::vector<s1> v13 = v6.p0;
    const s2 v33 = v8[0];
    const s2 v23 = v8[2];
    const s2 v34 = v8[5];
    const std::vector<s1> v46 = v0.p0;
    const std::vector<s1> v49 = v34.p0;
    std::vector<s2> v26 = v8;
    const std::vector<std::vector<s1>> v47 { v46, v13, v13, v46, v5 };
    const s2 v93 = v26[1];
    const std::vector<s1> v50 = v47[4];
    std::vector<s1> v39 = v50;
    const s3 v87(v49, v33, v93);
    v39 = v46;
    s3 v139 = v87;
    v139.p0 = v39;
    v26[3] = v23;
    return v139;
  }
  double f48(const double &v0) {
    double v1 = v0;
    const double v6 = v1 / v0;
    v1 = v6;
    double v5 = v0;
    double v8 = v6;
    const double v3 = v5 - v8;
    v1 = v8;
    double v11 = v8;
    double v12 = v11;
    double v15 = v12;
    double v49 = v6;
    const std::vector<double> v80 { v15 };
    const double v36 = v80[0];
    const std::vector<double> v38 { v3, v49 };
    std::vector<double> v75 = v38;
    const std::vector<std::vector<double>> v99 { v38, v38, v75, v38, v38 };
    const std::vector<double> v68 = v99[4];
    const double v84 = v68[1];
    v75[1] = v36;
    return v84;
  }
  s2 f41(const s2 &v0, const s2 &v1) {
    const std::vector<s1> v5 = v1.p0;
    const s1 v10 = v5[0];
    std::vector<s1> v3 = v5;
    const s3 v11(v3, v1, v1);
    const s3 v18 = f51(v11);
    const std::vector<std::vector<s0>> v20 = v10.p0;
    v3[0] = v10;
    const std::vector<s0> v41 = v10.p1;
    const s3 v101 = f51(v18);
    const s1 v44(v20, v41);
    const s2 v208 = v101.p1;
    v3[0] = v44;
    return v208;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const s2 v5 = v0.p1;
    const double v7 = f48(v1);
    const s2 v3 = f41(v5, v5);
    const s2 v4 = f41(v5, v3);
    const s2 v10 = f41(v4, v5);
    double v24 = v1;
    const std::vector<s1> v39 = v10.p0;
    const double v43 = f48(v24);
    const s1 v26 = v39[0];
    const std::vector<s0> v44 = v26.p1;
    const s0 v74 = v44[1];
    const double v62 = f48(v43);
    const std::vector<std::vector<double>> v49 = v74.p1;
    const std::vector<double> v113 = v49[2];
    std::vector<double> v172 = v113;
    const double v155 = v172[0];
    v172[0] = v7;
    const double v118 = f48(v62);
    v172[0] = v118;
    return v155;
  }
  int main() {
    s3 v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } } }, { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } } }, { { { { { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } }, { { { { { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } } }, { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } } }, { { { { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } }, { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } } }, { { { { { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } } }, { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } }, { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } } } }, { { { { { { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } } } }, { { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } }, { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } } } }, { { { { { { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } } } }, { { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } }, { { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } } } }, { { { { { { { 84.0 } }, { { 85.0 }, { 86.0 }, { 87.0 } } } } }, { { { { 88.0 } }, { { 89.0 }, { 90.0 }, { 91.0 } } }, { { { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } } } }, { { { { { { { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } } } }, { { { { 100.0 } }, { { 101.0 }, { 102.0 }, { 103.0 } } }, { { { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } } } } } } } });
    double v1(108.0);
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
