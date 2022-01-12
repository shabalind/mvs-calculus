  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    std::vector<s1> p1;
    s2(std::vector<s1> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s1> p0;
    std::vector<std::vector<s0>> p1;
    s4(std::vector<s1> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<std::vector<s2>> p0;
    s2 p1;
    s5(std::vector<std::vector<s2>> v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s2 p0;
    s4 p1;
    s6(s2 v0, s4 v1): p0(v0), p1(v1) { }
  };
  double f20(const double &v0) {
    double v6 = v0;
    v6 = v0;
    const std::vector<double> v2 { v0, v6, v0 };
    const double v3 = v2[1];
    double v1 = v6;
    double v13 = v3;
    const double v9 = v6 - v6;
    std::vector<double> v11 = v2;
    const double v8 = v1 + v13;
    const double v5 = v11[1];
    const double v4 = v2[1];
    std::vector<double> v17 = v11;
    std::vector<double> v23 = v2;
    v11 = v17;
    v11[1] = v8;
    const double v20 = v11[2];
    const double v21 = v23[0];
    std::vector<double> v31 = v11;
    v11[1] = v21;
    const double v28 = v31[1];
    const double v16 = v23[2];
    v23[2] = v5;
    std::vector<double> v26 = v11;
    std::vector<double> v45 = v23;
    double v33 = v4;
    const double v22 = v31[1];
    const double v32 = v45[2];
    v23[2] = v28;
    const double v44 = v17[1];
    const double v46 = v26[0];
    v45[2] = v28;
    v11[1] = v44;
    std::vector<double> v40 = v2;
    v40[1] = v22;
    v26[2] = v4;
    v45[1] = v1;
    const double v50 = v0 / v1;
    v45 = v17;
    std::vector<double> v39 = v40;
    const double v35 = v23[0];
    double v64 = v0;
    v45[1] = v20;
    v6 = v16;
    double v103 = v64;
    double v57 = v9;
    v45[2] = v35;
    v1 = v33;
    double v188 = v46;
    v26[0] = v50;
    v11[2] = v57;
    v23[1] = v16;
    v23[0] = v188;
    std::vector<double> v86 = v39;
    v39[0] = v103;
    v17 = v86;
    return v32;
  }
  __attribute__((noinline))
  double f0(const s6 &v0, const s5 &v1, const double &v2) {
    double v7 = v2;
    const double v16 = v7 / v7;
    const double v14 = f20(v16);
    return v14;
  }
  int main() {
    s6 v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } } }, { { { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } } } } }, { { { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 }, { 17.0 } } } } } }, { { { { { 18.0 }, { 19.0 }, { 20.0 } } }, { { { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } } } } }, { { { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } } }, { { { 33.0 }, { 34.0 }, { 35.0 } } } } }, { { { { 36.0 }, { 37.0 }, { 38.0 } } }, { { { { 39.0 }, { 40.0 }, { 41.0 } } }, { { { 42.0 }, { 43.0 }, { 44.0 } } } } } } }, { { { { { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } } }, { { { 51.0 }, { 52.0 }, { 53.0 } } } } } }, { { { { { 54.0 }, { 55.0 }, { 56.0 } } } }, { { { { 57.0 }, { 58.0 }, { 59.0 } } } } } } });
    s5 v1({ { { { { { { { { 60.0 }, { 61.0 }, { 62.0 } } }, { { { { 63.0 }, { 64.0 }, { 65.0 } } }, { { { 66.0 }, { 67.0 }, { 68.0 } } } } }, { { { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { { 72.0 }, { 73.0 }, { 74.0 } } }, { { { 75.0 }, { 76.0 }, { 77.0 } } } } } }, { { { { { 78.0 }, { 79.0 }, { 80.0 } } }, { { { { 81.0 }, { 82.0 }, { 83.0 } } }, { { { 84.0 }, { 85.0 }, { 86.0 } } } } }, { { { { 87.0 }, { 88.0 }, { 89.0 } } }, { { { { 90.0 }, { 91.0 }, { 92.0 } } }, { { { 93.0 }, { 94.0 }, { 95.0 } } } } }, { { { { 96.0 }, { 97.0 }, { 98.0 } } }, { { { { 99.0 }, { 100.0 }, { 101.0 } } }, { { { 102.0 }, { 103.0 }, { 104.0 } } } } } } } } }, { { { { { { 105.0 }, { 106.0 }, { 107.0 } } }, { { { { 108.0 }, { 109.0 }, { 110.0 } } }, { { { 111.0 }, { 112.0 }, { 113.0 } } } } }, { { { { 114.0 }, { 115.0 }, { 116.0 } } }, { { { { 117.0 }, { 118.0 }, { 119.0 } } }, { { { 120.0 }, { 121.0 }, { 122.0 } } } } } }, { { { { { 123.0 }, { 124.0 }, { 125.0 } } }, { { { { 126.0 }, { 127.0 }, { 128.0 } } }, { { { 129.0 }, { 130.0 }, { 131.0 } } } } }, { { { { 132.0 }, { 133.0 }, { 134.0 } } }, { { { { 135.0 }, { 136.0 }, { 137.0 } } }, { { { 138.0 }, { 139.0 }, { 140.0 } } } } }, { { { { 141.0 }, { 142.0 }, { 143.0 } } }, { { { { 144.0 }, { 145.0 }, { 146.0 } } }, { { { 147.0 }, { 148.0 }, { 149.0 } } } } } } } });
    double v2(150.0);
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
