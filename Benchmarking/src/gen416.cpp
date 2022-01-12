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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s1 p0;
    std::vector<s0> p1;
    s5(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s5 p0;
    std::vector<s1> p1;
    s6(s5 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s0 f98(const s0 &v0) {
    s0 v7 = v0;
    s0 v19 = v7;
    v7 = v0;
    return v19;
  }
  s0 f95(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<s0> v7 { v0, v5, v5, v0 };
    const s0 v2 = v7[0];
    const s0 v6 = v7[2];
    const s0 v8 = f98(v2);
    std::vector<s0> v15 = v7;
    const std::vector<std::vector<double>> v13 = v2.p1;
    const s0 v10 = v7[0];
    const s0 v12 = v7[3];
    const std::vector<std::vector<double>> v14 = v2.p1;
    const std::vector<std::vector<double>> v9 = v6.p1;
    v5.p0 = v13;
    v15[2] = v8;
    v5.p0 = v9;
    std::vector<s0> v25 = v7;
    v25[3] = v6;
    const std::vector<std::vector<double>> v34 = v10.p1;
    std::vector<std::vector<double>> v21 = v14;
    const std::vector<std::vector<double>> v30 = v10.p1;
    const s0 v11 = v15[3];
    v5.p1 = v30;
    const s0 v26 = f98(v12);
    v5.p0 = v21;
    v25[3] = v8;
    v5.p0 = v14;
    const s0 v37 = f98(v26);
    v5 = v8;
    const std::vector<std::vector<double>> v29 = v37.p0;
    const std::vector<std::vector<double>> v55 = v11.p1;
    v5.p1 = v29;
    v5.p1 = v9;
    v5.p0 = v30;
    const std::vector<std::vector<double>> v60 = v6.p0;
    const std::vector<std::vector<double>> v50 = v2.p1;
    std::vector<std::vector<double>> v44 = v21;
    v25[0] = v8;
    v5.p0 = v44;
    v5.p0 = v34;
    v5.p1 = v60;
    v5.p0 = v50;
    const std::vector<double> v135 = v55[1];
    const s0 v61 = v25[2];
    v44[0] = v135;
    return v61;
  }
  s0 f59(const s0 &v0) {
    const s0 v1 = f98(v0);
    const s0 v3 = f98(v1);
    const std::vector<std::vector<double>> v5 = v1.p1;
    const std::vector<std::vector<double>> v6 = v1.p0;
    const s0 v7 = f95(v1);
    const s0 v2 = f95(v3);
    s0 v13 = v7;
    s0 v10 = v13;
    v13 = v2;
    v10.p0 = v6;
    v10.p1 = v6;
    v13.p0 = v5;
    const std::vector<std::vector<double>> v18 = v7.p0;
    v13.p0 = v6;
    const s0 v47 = f95(v2);
    v10.p0 = v18;
    const std::vector<std::vector<double>> v88 = v47.p1;
    const s0 v48 = f98(v10);
    v13.p0 = v88;
    return v48;
  }
  __attribute__((noinline))
  double f0(const std::vector<s6> &v0, const double &v1) {
    const s6 v2 = v0[0];
    const std::vector<s1> v10 = v2.p1;
    const s1 v26 = v10[2];
    const s0 v20 = v26.p0;
    const s0 v18 = f59(v20);
    const std::vector<std::vector<double>> v79 = v18.p1;
    const std::vector<double> v146 = v79[1];
    std::vector<double> v105 = v146;
    v105[0] = v1;
    const double v96 = v105[0];
    return v96;
  }
  int main() {
    std::vector<s6> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } }, { { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } }, { { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } } } } }, { { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } } }, { { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } }, { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } } } } }, { { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } }, { { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } } }, { { { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } }, { { { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 }, { 100.0 }, { 101.0 } } } } } } } } });
    double v1(102.0);
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
