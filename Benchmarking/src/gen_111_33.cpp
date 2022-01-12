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
    std::vector<s1> p0;
    std::vector<std::vector<s1>> p1;
    std::vector<std::vector<s0>> p2;
    s2(std::vector<s1> v0, std::vector<std::vector<s1>> v1, std::vector<std::vector<s0>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s4 {
    std::vector<s2> p0;
    s2 p1;
    s0 p2;
    s0 p3;
    s4(std::vector<s2> v0, s2 v1, s0 v2, s0 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  double f4(const double &v0) {
    double v7 = v0;
    double v6 = v7;
    double v5 = v6;
    double v1 = v6;
    double v2 = v7;
    double v4 = v0;
    double v9 = v7;
    double v3 = v2;
    double v12 = v9;
    double v20 = v2;
    double v15 = v9;
    double v13 = v1;
    v2 = v13;
    double v30 = v1;
    double v29 = v12;
    double v32 = v15;
    double v23 = v6;
    double v49 = v29;
    const double v25 = v29 + v2;
    double v27 = v49;
    double v58 = v20;
    double v69 = v4;
    double v57 = v5;
    double v42 = v49;
    const std::vector<double> v59 { v69, v58, v25 };
    const double v70 = v59[0];
    std::vector<double> v74 = v59;
    v74[0] = v42;
    const std::vector<double> v68 { v32, v30, v12, v3, v69, v70, v23 };
    const double v102 = v68[1];
    const double v89 = v68[1];
    std::vector<double> v48 = v74;
    const double v62 = v74[0];
    const double v85 = v68[6];
    const double v61 = v85 / v7;
    std::vector<double> v92 = v68;
    v74[1] = v23;
    v48[1] = v85;
    v48[2] = v57;
    const double v125 = v48[2];
    std::vector<double> v117 = v92;
    double v90 = v125;
    v74[1] = v1;
    double v149 = v90;
    v117[5] = v62;
    std::vector<double> v170 = v117;
    v48[0] = v6;
    v74[0] = v102;
    v74[2] = v149;
    v29 = v61;
    std::vector<double> v358 = v170;
    const double v253 = v358[6];
    v74[2] = v89;
    v74[1] = v27;
    return v253;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const std::vector<s1> &v1, const double &v2) {
    const double v12 = f4(v2);
    double v11 = v12;
    const double v10 = f4(v2);
    const double v72 = v10 / v11;
    const double v54 = f4(v11);
    const double v49 = v54 / v72;
    const double v120 = f4(v49);
    return v120;
  }
  int main() {
    s4 v0({ { { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } }, { { { { { { { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } }, { { { { { { 18.0 } }, { { 19.0 }, { 20.0 } } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } } } }, { { { { { 24.0 } }, { { 25.0 }, { 26.0 } } } }, { { { { 27.0 } }, { { 28.0 }, { 29.0 } } } }, { { { { 30.0 } }, { { 31.0 }, { 32.0 } } } } } }, { { { { { { { 33.0 } }, { { 34.0 }, { 35.0 } } } }, { { { 36.0 } }, { { 37.0 }, { 38.0 } } } }, { { { { { 39.0 } }, { { 40.0 }, { 41.0 } } } }, { { { 42.0 } }, { { 43.0 }, { 44.0 } } } } }, { { { { { { { 45.0 } }, { { 46.0 }, { 47.0 } } } }, { { { 48.0 } }, { { 49.0 }, { 50.0 } } } } }, { { { { { { 51.0 } }, { { 52.0 }, { 53.0 } } } }, { { { 54.0 } }, { { 55.0 }, { 56.0 } } } } } }, { { { { { 57.0 } }, { { 58.0 }, { 59.0 } } } }, { { { { 60.0 } }, { { 61.0 }, { 62.0 } } } }, { { { { 63.0 } }, { { 64.0 }, { 65.0 } } } } } } }, { { { { { { { 66.0 } }, { { 67.0 }, { 68.0 } } } }, { { { 69.0 } }, { { 70.0 }, { 71.0 } } } }, { { { { { 72.0 } }, { { 73.0 }, { 74.0 } } } }, { { { 75.0 } }, { { 76.0 }, { 77.0 } } } } }, { { { { { { { 78.0 } }, { { 79.0 }, { 80.0 } } } }, { { { 81.0 } }, { { 82.0 }, { 83.0 } } } } }, { { { { { { 84.0 } }, { { 85.0 }, { 86.0 } } } }, { { { 87.0 } }, { { 88.0 }, { 89.0 } } } } } }, { { { { { 90.0 } }, { { 91.0 }, { 92.0 } } } }, { { { { 93.0 } }, { { 94.0 }, { 95.0 } } } }, { { { { 96.0 } }, { { 97.0 }, { 98.0 } } } } } }, { { { 99.0 } }, { { 100.0 }, { 101.0 } } }, { { { 102.0 } }, { { 103.0 }, { 104.0 } } } });
    std::vector<s1> v1({ { { { { { 105.0 } }, { { 106.0 }, { 107.0 } } } }, { { { 108.0 } }, { { 109.0 }, { 110.0 } } } }, { { { { { 111.0 } }, { { 112.0 }, { 113.0 } } } }, { { { 114.0 } }, { { 115.0 }, { 116.0 } } } } });
    double v2(117.0);
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
