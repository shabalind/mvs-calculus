  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f4(const s0 &v0) {
    const std::vector<std::vector<double>> v2 = v0.p0;
    const std::vector<std::vector<double>> v7 = v0.p1;
    const std::vector<std::vector<double>> v3 = v0.p0;
    s0 v4 = v0;
    v4 = v0;
    s0 v12 = v4;
    const std::vector<std::vector<double>> v1 = v4.p1;
    v4.p0 = v3;
    v12.p0 = v3;
    const s0 v10(v1, v7);
    const std::vector<std::vector<double>> v13 = v4.p1;
    v12.p0 = v13;
    const std::vector<std::vector<double>> v8 = v4.p1;
    v4.p1 = v3;
    const std::vector<std::vector<double>> v16 = v4.p1;
    v12 = v10;
    v12.p0 = v1;
    const std::vector<std::vector<double>> v45 = v10.p1;
    const std::vector<std::vector<double>> v49 = v4.p1;
    std::vector<std::vector<double>> v59 = v45;
    s0 v44 = v0;
    const std::vector<std::vector<double>> v40 = v44.p1;
    v12.p0 = v2;
    v44.p1 = v45;
    v4.p1 = v59;
    v44.p0 = v16;
    s0 v72 = v12;
    v44.p0 = v40;
    const std::vector<std::vector<double>> v79 = v72.p0;
    const s0 v127(v3, v49);
    s0 v66 = v12;
    v72.p0 = v8;
    v66.p1 = v40;
    v12 = v127;
    v12.p1 = v2;
    v66.p0 = v79;
    return v66;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s0> &v1, const std::vector<s0> &v2, const s0 &v3, const double &v4) {
    const s0 v6 = v2[0];
    double v8 = v4;
    const s0 v15 = f4(v3);
    double v12 = v8;
    s0 v32 = v15;
    const s0 v11 = v1[0];
    const std::vector<std::vector<double>> v21 = v6.p0;
    const s0 v16 = v2[2];
    const std::vector<std::vector<double>> v17 = v16.p1;
    const s0 v48 = f4(v3);
    v32.p1 = v17;
    v32.p0 = v21;
    const std::vector<std::vector<double>> v29 = v48.p1;
    const std::vector<std::vector<double>> v33 = v11.p0;
    v32.p0 = v33;
    const std::vector<std::vector<double>> v44 = v32.p1;
    const std::vector<double> v27 = v44[2];
    v32.p1 = v21;
    const double v76 = v12 - v12;
    v32.p1 = v29;
    std::vector<double> v96 = v27;
    const double v114 = v96[0];
    const std::vector<double> v108 { v12, v76, v76, v114 };
    v96[0] = v114;
    const double v85 = v108[3];
    return v85;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } });
    std::vector<s0> v1({ { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } });
    std::vector<s0> v2({ { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } });
    s0 v3({ { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } });
    double v4(36.0);
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
