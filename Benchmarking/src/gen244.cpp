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
    std::vector<s1> p0;
    std::vector<s1> p1;
    s2(std::vector<s1> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  double f17(const double &v0) {
    double v1 = v0;
    double v2 = v1;
    double v5 = v2;
    v1 = v0;
    double v7 = v2;
    const std::vector<double> v6 { v7, v1, v5, v0, v0, v1 };
    const double v3 = v6[0];
    const double v8 = v6[2];
    const double v15 = v6[5];
    std::vector<double> v17 = v6;
    std::vector<double> v4 = v17;
    v17[2] = v7;
    v4[0] = v3;
    const std::vector<std::vector<double>> v9 { v4, v6 };
    v1 = v15;
    double v11 = v8;
    const double v13 = v17[0];
    std::vector<std::vector<double>> v10 = v9;
    const std::vector<double> v24 = v10[0];
    const double v31 = v6[3];
    v4[0] = v13;
    const double v22 = v6[1];
    const double v21 = v15 * v1;
    v11 = v22;
    const double v23 = v0 + v11;
    std::vector<double> v40 = v24;
    double v47 = v8;
    const double v33 = v4[2];
    v40[3] = v23;
    std::vector<double> v27 = v40;
    double v34 = v2;
    std::vector<std::vector<double>> v41 = v9;
    v10[0] = v17;
    const std::vector<double> v42 = v9[1];
    const std::vector<double> v36 = v41[1];
    v27[4] = v15;
    const double v50 = v36[0];
    double v74 = v47;
    v41[0] = v42;
    std::vector<std::vector<double>> v49 = v10;
    std::vector<double> v83 = v27;
    const std::vector<double> v44 = v41[0];
    v40[1] = v33;
    std::vector<std::vector<double>> v38 = v49;
    v17[3] = v21;
    v49[1] = v44;
    v49[0] = v40;
    v40[1] = v5;
    v74 = v13;
    const std::vector<double> v37 = v38[0];
    v27[3] = v1;
    const std::vector<double> v32 = v10[1];
    v49[1] = v32;
    const std::vector<double> v93 = v38[0];
    std::vector<double> v81 = v17;
    const std::vector<double> v250 = v41[0];
    double v137 = v50;
    v49[1] = v37;
    v49[0] = v81;
    std::vector<double> v144 = v93;
    v81[1] = v0;
    v81[2] = v74;
    v10[1] = v83;
    v41[0] = v250;
    v40[4] = v31;
    const double v120 = v144[3];
    v40[0] = v137;
    const double v134 = v120 + v34;
    return v134;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const s2 &v1, const s1 &v2, const s2 &v3, const double &v4) {
    const double v5 = v4 - v4;
    double v25 = v4;
    double v95 = v5;
    const double v141 = f17(v95);
    const double v192 = v141 / v25;
    const double v144 = v192 + v25;
    return v144;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } }, { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } }, { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } }, { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } }, { { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } } } } }, { { { { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } }, { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } }, { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } }, { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } }, { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } } } }, { { { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 } } }, { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 } } } }, { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 } } }, { { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 } } } } } } } });
    s2 v1({ { { { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 } } }, { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 } } } }, { { { { 88.0 }, { 89.0 }, { 90.0 } }, { { 91.0 } } }, { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 } } } }, { { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 } } }, { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 } } } } }, { { { { { 104.0 }, { 105.0 }, { 106.0 } }, { { 107.0 } } }, { { { 108.0 }, { 109.0 }, { 110.0 } }, { { 111.0 } } } }, { { { { 112.0 }, { 113.0 }, { 114.0 } }, { { 115.0 } } }, { { { 116.0 }, { 117.0 }, { 118.0 } }, { { 119.0 } } } } } });
    s1 v2({ { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 } } }, { { { 124.0 }, { 125.0 }, { 126.0 } }, { { 127.0 } } } });
    s2 v3({ { { { { { 128.0 }, { 129.0 }, { 130.0 } }, { { 131.0 } } }, { { { 132.0 }, { 133.0 }, { 134.0 } }, { { 135.0 } } } }, { { { { 136.0 }, { 137.0 }, { 138.0 } }, { { 139.0 } } }, { { { 140.0 }, { 141.0 }, { 142.0 } }, { { 143.0 } } } }, { { { { 144.0 }, { 145.0 }, { 146.0 } }, { { 147.0 } } }, { { { 148.0 }, { 149.0 }, { 150.0 } }, { { 151.0 } } } } }, { { { { { 152.0 }, { 153.0 }, { 154.0 } }, { { 155.0 } } }, { { { 156.0 }, { 157.0 }, { 158.0 } }, { { 159.0 } } } }, { { { { 160.0 }, { 161.0 }, { 162.0 } }, { { 163.0 } } }, { { { 164.0 }, { 165.0 }, { 166.0 } }, { { 167.0 } } } } } });
    double v4(168.0);
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
