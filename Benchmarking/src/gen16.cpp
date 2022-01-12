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
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<std::vector<s2>> p0;
    s2 p1;
    s4(std::vector<std::vector<s2>> v0, s2 v1): p0(v0), p1(v1) { }
  };
  s0 f121(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    const s1 v1(v0, v0);
    const std::vector<double> v9 = v6[2];
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<double> v3 = v6[0];
    const std::vector<double> v14 = v4[1];
    const s0 v11(v6, v4);
    const std::vector<std::vector<double>> v23 = v11.p0;
    const std::vector<std::vector<double>> v24 { v3, v14, v3, v3, v14, v9 };
    const s0 v20 = v1.p0;
    s1 v17 = v1;
    const std::vector<std::vector<double>> v33 = v11.p0;
    const std::vector<std::vector<double>> v19 = v11.p0;
    s0 v41 = v11;
    const s0 v43 = v17.p1;
    s0 v59 = v41;
    const s0 v52 = v17.p1;
    std::vector<std::vector<double>> v54 = v24;
    const s0 v27 = v1.p1;
    const std::vector<std::vector<double>> v32 = v11.p1;
    v17.p1 = v41;
    std::vector<std::vector<double>> v77 = v23;
    const s1 v58(v27, v20);
    const std::vector<double> v22 = v54[2];
    std::vector<std::vector<double>> v56 = v33;
    v17 = v1;
    v17.p0 = v52;
    v41.p1 = v32;
    v41.p0 = v56;
    s1 v45 = v58;
    v45.p1 = v59;
    const s0 v97(v77, v32);
    const s0 v71 = v45.p0;
    v45.p0 = v0;
    v45.p0 = v43;
    v45.p0 = v97;
    v17.p1 = v59;
    v41.p1 = v32;
    v41.p0 = v19;
    v77[1] = v22;
    return v71;
  }
  s0 f6(const s0 &v0) {
    s0 v6 = v0;
    s0 v3 = v6;
    const std::vector<std::vector<double>> v4 = v3.p1;
    v3.p1 = v4;
    s0 v9 = v3;
    const std::vector<std::vector<double>> v10 = v3.p1;
    v6.p1 = v4;
    v9.p1 = v10;
    v9 = v3;
    const s0 v60 = f121(v9);
    return v60;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const double &v1) {
    const s4 v2 = v0[0];
    const s2 v4 = v2.p1;
    const s0 v10 = v4.p1;
    s0 v18 = v10;
    const s0 v12 = f6(v18);
    const s0 v29 = f6(v12);
    const std::vector<std::vector<double>> v24 = v12.p1;
    v18.p1 = v24;
    const std::vector<std::vector<double>> v36 = v29.p1;
    const std::vector<double> v66 = v36[1];
    const double v61 = v66[0];
    return v61;
  }
  int main() {
    std::vector<s4> v0({ { { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } } }, { { { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } } } }, { { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } }, { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } } } }, { { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } } }, { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } }, { { { { { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } } }, { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } } } }, { { { { { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } } }, { { { 55.0 }, { 56.0 }, { 57.0 } }, { { 58.0 }, { 59.0 } } } } }, { { { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 } } } }, { { { 65.0 }, { 66.0 }, { 67.0 } }, { { 68.0 }, { 69.0 } } } } } }, { { { { { 70.0 }, { 71.0 }, { 72.0 } }, { { 73.0 }, { 74.0 } } } }, { { { 75.0 }, { 76.0 }, { 77.0 } }, { { 78.0 }, { 79.0 } } } } }, { { { { { { { { 80.0 }, { 81.0 }, { 82.0 } }, { { 83.0 }, { 84.0 } } } }, { { { 85.0 }, { 86.0 }, { 87.0 } }, { { 88.0 }, { 89.0 } } } } }, { { { { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 } } } }, { { { 95.0 }, { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } } } } }, { { { { { { 100.0 }, { 101.0 }, { 102.0 } }, { { 103.0 }, { 104.0 } } } }, { { { 105.0 }, { 106.0 }, { 107.0 } }, { { 108.0 }, { 109.0 } } } } } }, { { { { { 110.0 }, { 111.0 }, { 112.0 } }, { { 113.0 }, { 114.0 } } } }, { { { 115.0 }, { 116.0 }, { 117.0 } }, { { 118.0 }, { 119.0 } } } } } });
    double v1(120.0);
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
