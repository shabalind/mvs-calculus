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
    std::vector<std::vector<s0>> p2;
    s2(std::vector<s0> v0, s1 v1, std::vector<std::vector<s0>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    std::vector<s2> p0;
    s1 p1;
    s2 p2;
    s1 p3;
    s1 p4;
    std::vector<s1> p5;
    std::vector<s0> p6;
    s0 p7;
    s3(std::vector<s2> v0, s1 v1, s2 v2, s1 v3, s1 v4, std::vector<s1> v5, std::vector<s0> v6, s0 v7): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6), p7(v7) { }
  };
  struct s4 {
    std::vector<std::vector<s2>> p0;
    std::vector<std::vector<s2>> p1;
    s4(std::vector<std::vector<s2>> v0, std::vector<std::vector<s2>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<std::vector<s1>> p0;
    s1 p1;
    s5(std::vector<std::vector<s1>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s1 p0;
    s4 p1;
    s6(s1 v0, s4 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    s5 p0;
    std::vector<std::vector<s5>> p1;
    s3 p2;
    s1 p3;
    std::vector<s1> p4;
    s8(s5 v0, std::vector<std::vector<s5>> v1, s3 v2, s1 v3, std::vector<s1> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  double f10(const double &v0) {
    const double v4 = v0 / v0;
    const double v5 = v0 / v0;
    double v1 = v5;
    double v10 = v4;
    double v2 = v4;
    double v12 = v10;
    double v11 = v10;
    double v8 = v4;
    double v13 = v12;
    double v15 = v11;
    const std::vector<double> v21 { v8, v10, v8 };
    std::vector<double> v14 = v21;
    v14[0] = v15;
    const double v27 = v21[0];
    std::vector<double> v24 = v21;
    std::vector<double> v18 = v24;
    std::vector<double> v33 = v18;
    v2 = v8;
    const double v29 = v24[1];
    v33[1] = v11;
    const double v19 = v33[0];
    const double v51 = v18[0];
    const double v26 = v18[0];
    std::vector<double> v45 = v33;
    const double v43 = v0 - v0;
    v24[0] = v4;
    double v72 = v2;
    std::vector<double> v76 = v14;
    v76[2] = v13;
    double v54 = v4;
    std::vector<double> v32 = v18;
    const double v94 = v45[2];
    v24[1] = v51;
    const double v81 = v32[1];
    std::vector<double> v41 = v45;
    const double v42 = v32[2];
    v76[1] = v27;
    v76[2] = v1;
    const double v47 = v76[0];
    v12 = v43;
    std::vector<double> v65 = v41;
    std::vector<double> v101 = v14;
    double v38 = v81;
    const double v60 = v32[2];
    std::vector<double> v40 = v65;
    const double v56 = v45[1];
    const double v109 = v76[2];
    v15 = v94;
    v14 = v101;
    double v196 = v19;
    v12 = v109;
    const double v86 = v56 - v29;
    v45[2] = v72;
    const double v78 = v86 + v26;
    v41[0] = v196;
    v41[0] = v42;
    v13 = v5;
    v10 = v54;
    const double v130 = v40[1];
    v33[2] = v130;
    v11 = v29;
    v32 = v18;
    v101[1] = v60;
    v41[0] = v47;
    v45[1] = v94;
    v65[2] = v38;
    return v78;
  }
  __attribute__((noinline))
  double f0(const s8 &v0, const s6 &v1, const double &v2) {
    double v11 = v2;
    double v15 = v11;
    const double v53 = f10(v15);
    return v53;
  }
  int main() {
    s8 v0({ { { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } } }, { { { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } } } }, { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } } }, { { { { { { { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } } } }, { { { { { 16.0 } }, { { 17.0 } } }, { { { 18.0 } }, { { 19.0 } } } } } }, { { { { 20.0 } }, { { 21.0 } } }, { { { 22.0 } }, { { 23.0 } } } } } }, { { { { { { { { 24.0 } }, { { 25.0 } } }, { { { 26.0 } }, { { 27.0 } } } } }, { { { { { 28.0 } }, { { 29.0 } } }, { { { 30.0 } }, { { 31.0 } } } } } }, { { { { 32.0 } }, { { 33.0 } } }, { { { 34.0 } }, { { 35.0 } } } } } }, { { { { { { { { 36.0 } }, { { 37.0 } } }, { { { 38.0 } }, { { 39.0 } } } } }, { { { { { 40.0 } }, { { 41.0 } } }, { { { 42.0 } }, { { 43.0 } } } } } }, { { { { 44.0 } }, { { 45.0 } } }, { { { 46.0 } }, { { 47.0 } } } } } } }, { { { { { { { 48.0 } }, { { 49.0 } } }, { { { 50.0 } }, { { 51.0 } } }, { { { 52.0 } }, { { 53.0 } } } }, { { { { 54.0 } }, { { 55.0 } } }, { { { 56.0 } }, { { 57.0 } } } }, { { { { { 58.0 } }, { { 59.0 } } } } } } }, { { { { 60.0 } }, { { 61.0 } } }, { { { 62.0 } }, { { 63.0 } } } }, { { { { { 64.0 } }, { { 65.0 } } }, { { { 66.0 } }, { { 67.0 } } }, { { { 68.0 } }, { { 69.0 } } } }, { { { { 70.0 } }, { { 71.0 } } }, { { { 72.0 } }, { { 73.0 } } } }, { { { { { 74.0 } }, { { 75.0 } } } } } }, { { { { 76.0 } }, { { 77.0 } } }, { { { 78.0 } }, { { 79.0 } } } }, { { { { 80.0 } }, { { 81.0 } } }, { { { 82.0 } }, { { 83.0 } } } }, { { { { { 84.0 } }, { { 85.0 } } }, { { { 86.0 } }, { { 87.0 } } } } }, { { { { 88.0 } }, { { 89.0 } } } }, { { { 90.0 } }, { { 91.0 } } } }, { { { { 92.0 } }, { { 93.0 } } }, { { { 94.0 } }, { { 95.0 } } } }, { { { { { 96.0 } }, { { 97.0 } } }, { { { 98.0 } }, { { 99.0 } } } }, { { { { 100.0 } }, { { 101.0 } } }, { { { 102.0 } }, { { 103.0 } } } } } });
    s6 v1({ { { { { 104.0 } }, { { 105.0 } } }, { { { 106.0 } }, { { 107.0 } } } }, { { { { { { { { 108.0 } }, { { 109.0 } } }, { { { 110.0 } }, { { 111.0 } } }, { { { 112.0 } }, { { 113.0 } } } }, { { { { 114.0 } }, { { 115.0 } } }, { { { 116.0 } }, { { 117.0 } } } }, { { { { { 118.0 } }, { { 119.0 } } } } } } } }, { { { { { { { 120.0 } }, { { 121.0 } } }, { { { 122.0 } }, { { 123.0 } } }, { { { 124.0 } }, { { 125.0 } } } }, { { { { 126.0 } }, { { 127.0 } } }, { { { 128.0 } }, { { 129.0 } } } }, { { { { { 130.0 } }, { { 131.0 } } } } } } }, { { { { { { 132.0 } }, { { 133.0 } } }, { { { 134.0 } }, { { 135.0 } } }, { { { 136.0 } }, { { 137.0 } } } }, { { { { 138.0 } }, { { 139.0 } } }, { { { 140.0 } }, { { 141.0 } } } }, { { { { { 142.0 } }, { { 143.0 } } } } } } } } } });
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
