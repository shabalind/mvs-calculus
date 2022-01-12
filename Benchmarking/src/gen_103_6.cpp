  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    double p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, double v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    std::vector<s2> p1;
    std::vector<std::vector<s0>> p2;
    s3(std::vector<s1> v0, std::vector<s2> v1, std::vector<std::vector<s0>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s10 {
    std::vector<s0> p0;
    s3 p1;
    s10(std::vector<s0> v0, s3 v1): p0(v0), p1(v1) { }
  };
  double f50(const double &v0) {
    double v1 = v0;
    const double v7 = v1 - v0;
    const double v13 = v0 * v1;
    double v4 = v13;
    double v8 = v1;
    double v6 = v1;
    double v5 = v6;
    double v10 = v8;
    double v17 = v0;
    double v3 = v7;
    v8 = v1;
    const double v11 = v13 + v5;
    double v16 = v17;
    double v12 = v1;
    double v15 = v1;
    double v19 = v15;
    double v14 = v12;
    const std::vector<double> v34 { v12, v5, v12, v15, v15, v16 };
    std::vector<double> v35 = v34;
    const double v24 = v15 * v1;
    const double v51 = v35[1];
    const double v25 = v15 * v11;
    const double v32 = v14 - v10;
    v35[0] = v25;
    const std::vector<double> v23 { v51, v16, v24, v19, v17, v32, v24 };
    std::vector<double> v53 = v23;
    const double v28 = v53[4];
    const double v33 = v35[0];
    v35[5] = v33;
    std::vector<double> v29 = v35;
    v53[2] = v4;
    const double v46 = v34[1];
    const double v60 = v34[1];
    v29[5] = v3;
    v53[1] = v8;
    v17 = v46;
    std::vector<double> v58 = v29;
    v29[3] = v28;
    std::vector<double> v37 = v58;
    v37[5] = v60;
    const double v49 = v37[5];
    v37[4] = v11;
    return v49;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const s10 &v1, const double &v2) {
    const double v6 = f50(v2);
    const double v11 = f50(v2);
    const double v9 = v11 + v11;
    const double v78 = v9 + v6;
    return v78;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } }, 4.0 }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 } }, 9.0 } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 } }, 14.0 }, { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 } }, 19.0 } }, { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } }, 24.0 }, { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 } }, 29.0 } } });
    s10 v1({ { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 } }, 34.0 } }, { { { { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 } }, 39.0 }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } }, 44.0 } } }, { { { { { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 } }, 49.0 }, { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 } }, 54.0 } }, { { { { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 } }, 59.0 }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 } }, 64.0 } } }, { { { 65.0 }, { 66.0 } }, { { 67.0 }, { 68.0 } }, 69.0 } } }, { { { { { 70.0 }, { 71.0 } }, { { 72.0 }, { 73.0 } }, 74.0 } } } } });
    double v2(75.0);
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
