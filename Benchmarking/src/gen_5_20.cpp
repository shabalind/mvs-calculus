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
  struct s4 {
    double p0;
    std::vector<s1> p1;
    s4(double v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s4 p0;
    s1 p1;
    s7(s4 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s11 {
    std::vector<s1> p0;
    std::vector<s7> p1;
    s11(std::vector<s1> v0, std::vector<s7> v1): p0(v0), p1(v1) { }
  };
  double f69(const double &v0) {
    double v7 = v0;
    double v6 = v7;
    double v4 = v7;
    double v5 = v0;
    double v2 = v7;
    double v1 = v6;
    double v11 = v7;
    double v3 = v0;
    double v8 = v3;
    double v19 = v5;
    double v9 = v0;
    v8 = v4;
    double v12 = v0;
    v19 = v12;
    double v25 = v1;
    double v28 = v2;
    double v10 = v4;
    double v14 = v4;
    double v18 = v9;
    const std::vector<double> v26 { v8, v6, v11, v19 };
    std::vector<double> v20 = v26;
    double v16 = v4;
    v20[3] = v25;
    std::vector<double> v22 = v26;
    v4 = v5;
    const double v21 = v22[0];
    v22[2] = v10;
    const double v33 = v22[0];
    double v27 = v33;
    const std::vector<std::vector<double>> v60 { v20 };
    v4 = v18;
    const std::vector<double> v42 { v21, v16 };
    std::vector<double> v70 = v42;
    v70[0] = v18;
    v22[1] = v28;
    const std::vector<double> v84 = v60[0];
    const double v35 = v70[1];
    const double v51 = v70[0];
    const double v41 = v42[1];
    const double v77 = v70[0];
    std::vector<double> v80 = v42;
    std::vector<double> v214 = v80;
    v28 = v11;
    std::vector<double> v125 = v214;
    v20[3] = v51;
    std::vector<double> v176 = v125;
    v1 = v41;
    v3 = v14;
    v125[1] = v35;
    v214[1] = v27;
    v20[3] = v18;
    v80[0] = v18;
    std::vector<double> v127 = v176;
    const double v150 = v127[0];
    const double v114 = v84[2];
    const double v145 = v114 + v150;
    v80[0] = v77;
    return v145;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s11 &v1, const double &v2) {
    const double v4 = v2 * v2;
    const double v3 = f69(v4);
    const double v11 = f69(v3);
    double v32 = v11;
    const double v27 = f69(v32);
    return v27;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } });
    s11 v1({ { { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } } } }, { { { 28.0, { { { { { 29.0 } }, { { 30.0 }, { 31.0 }, { 32.0 } } }, { { { 33.0 } }, { { 34.0 }, { 35.0 }, { 36.0 } } } }, { { { { 37.0 } }, { { 38.0 }, { 39.0 }, { 40.0 } } }, { { { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } } } } }, { { { { 45.0 } }, { { 46.0 }, { 47.0 }, { 48.0 } } }, { { { 49.0 } }, { { 50.0 }, { 51.0 }, { 52.0 } } } } }, { { 53.0, { { { { { 54.0 } }, { { 55.0 }, { 56.0 }, { 57.0 } } }, { { { 58.0 } }, { { 59.0 }, { 60.0 }, { 61.0 } } } }, { { { { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } }, { { { 66.0 } }, { { 67.0 }, { 68.0 }, { 69.0 } } } } } }, { { { { 70.0 } }, { { 71.0 }, { 72.0 }, { 73.0 } } }, { { { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } } } }, { { 78.0, { { { { { 79.0 } }, { { 80.0 }, { 81.0 }, { 82.0 } } }, { { { 83.0 } }, { { 84.0 }, { 85.0 }, { 86.0 } } } }, { { { { 87.0 } }, { { 88.0 }, { 89.0 }, { 90.0 } } }, { { { 91.0 } }, { { 92.0 }, { 93.0 }, { 94.0 } } } } } }, { { { { 95.0 } }, { { 96.0 }, { 97.0 }, { 98.0 } } }, { { { 99.0 } }, { { 100.0 }, { 101.0 }, { 102.0 } } } } } } });
    double v2(103.0);
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
