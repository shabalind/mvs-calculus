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
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f13(const s0 &v0, const s0 &v1, const s0 &v2) {
    const std::vector<s0> v7 { v0, v1 };
    std::vector<s0> v4 = v7;
    std::vector<s0> v8 = v4;
    v8 = v7;
    v8[1] = v1;
    const s0 v74 = v8[0];
    return v74;
  }
  s0 f7(const s0 &v0, const s0 &v1) {
    s0 v7 = v0;
    const s0 v6 = f13(v0, v7, v7);
    const std::vector<std::vector<double>> v4 = v6.p1;
    v7 = v1;
    s0 v2 = v7;
    std::vector<std::vector<double>> v5 = v4;
    v7.p1 = v5;
    const std::vector<double> v10 = v4[0];
    s0 v9 = v7;
    const s0 v12 = f13(v2, v6, v9);
    const std::vector<std::vector<double>> v30 { v10 };
    v2.p1 = v30;
    v5[0] = v10;
    const std::vector<double> v15 = v4[0];
    v5[0] = v10;
    v5[0] = v10;
    v5[0] = v15;
    v2 = v0;
    v7.p1 = v30;
    v5[0] = v10;
    v5[0] = v10;
    return v12;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<std::vector<s1>> &v1, const double &v2) {
    const s0 v6 = f13(v0, v0, v0);
    s0 v4 = v6;
    const std::vector<std::vector<double>> v7 = v4.p1;
    double v3 = v2;
    std::vector<std::vector<double>> v10 = v7;
    s0 v11 = v0;
    const std::vector<std::vector<double>> v8 = v11.p0;
    const std::vector<double> v9 = v10[0];
    const double v16 = v9[0];
    const s0 v15 = f13(v11, v0, v4);
    const std::vector<std::vector<double>> v12 = v4.p1;
    v10[0] = v9;
    const std::vector<std::vector<double>> v43 = v15.p1;
    const s0 v14(v8, v43);
    v4.p0 = v8;
    const s0 v24 = f7(v0, v4);
    const std::vector<std::vector<double>> v40 = v14.p0;
    const std::vector<double> v51 { v3 };
    double v29 = v16;
    const std::vector<double> v23 = v10[0];
    v4.p0 = v8;
    const std::vector<std::vector<double>> v18 = v14.p0;
    v10[0] = v23;
    v4.p0 = v40;
    v10[0] = v51;
    std::vector<std::vector<double>> v56 = v8;
    const std::vector<std::vector<double>> v31 = v24.p1;
    const double v36 = v16 + v16;
    const std::vector<double> v48 = v18[1];
    v4.p0 = v56;
    v11.p1 = v12;
    const std::vector<double> v117 = v31[0];
    v56[0] = v23;
    v56[2] = v117;
    v56[1] = v48;
    v10[0] = v48;
    const double v318 = v29 / v36;
    return v318;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } });
    std::vector<std::vector<s1>> v1({ { { { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } } } }, { { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } } }, { { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } }, { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } } } } }, { { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } }, { { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } } } } } });
    double v2(52.0);
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
