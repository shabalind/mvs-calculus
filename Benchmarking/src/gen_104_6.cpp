  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<std::vector<s0>> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  double f16(const double &v0) {
    double v7 = v0;
    double v4 = v0;
    const double v5 = v0 / v4;
    double v6 = v5;
    double v11 = v0;
    double v8 = v0;
    double v1 = v11;
    double v9 = v4;
    double v29 = v8;
    double v17 = v9;
    double v20 = v8;
    double v43 = v5;
    double v18 = v6;
    const std::vector<double> v34 { v20, v29, v17, v18 };
    double v24 = v18;
    std::vector<double> v37 = v34;
    v37[3] = v1;
    const double v32 = v37[2];
    v37[1] = v1;
    std::vector<double> v27 = v34;
    v37[2] = v32;
    const double v19 = v37[3];
    double v31 = v19;
    std::vector<double> v58 = v27;
    v37[2] = v5;
    const double v59 = v58[2];
    std::vector<double> v60 = v27;
    v37[2] = v7;
    std::vector<double> v82 = v60;
    v82[1] = v24;
    v60[3] = v59;
    std::vector<double> v63 = v37;
    const double v40 = v63[1];
    v63[1] = v40;
    v27[1] = v40;
    const double v50 = v37[1];
    double v140 = v50;
    v27[1] = v31;
    v27[1] = v5;
    v27[0] = v4;
    v82[1] = v43;
    v27[1] = v140;
    const double v78 = v82[1];
    return v78;
  }
  std::vector<double> f1(const std::vector<double> &v0) {
    std::vector<double> v1 = v0;
    const double v3 = v1[0];
    const double v4 = v0[0];
    const double v6 = v0[0];
    const std::vector<std::vector<double>> v5 { v1, v1 };
    const std::vector<double> v2 = v5[1];
    const double v9 = v3 * v4;
    v1[0] = v3;
    std::vector<std::vector<double>> v10 = v5;
    v10[0] = v2;
    std::vector<double> v21 = v2;
    const double v14 = v6 * v9;
    const double v50 = f16(v9);
    const double v23 = f16(v14);
    const std::vector<std::vector<std::vector<double>>> v33 { v5, v10 };
    std::vector<std::vector<std::vector<double>>> v24 = v33;
    v21[0] = v50;
    v10[1] = v0;
    const double v72 = f16(v23);
    v10[1] = v21;
    v24[1] = v10;
    const double v95 = f16(v72);
    const std::vector<std::vector<double>> v83 = v24[0];
    v21[0] = v95;
    v24[1] = v10;
    const std::vector<double> v125 = v83[1];
    return v125;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const s1 v9 = v0[2];
    const std::vector<std::vector<s0>> v7 = v9.p1;
    std::vector<std::vector<s0>> v15 = v7;
    const std::vector<s0> v13 = v15[0];
    const double v20 = f16(v1);
    const std::vector<s0> v33 = v15[0];
    const double v25 = f16(v20);
    const std::vector<std::vector<s0>> v30 { v13, v13, v33, v33, v13 };
    std::vector<std::vector<s0>> v40 = v30;
    std::vector<s0> v39 = v13;
    const std::vector<s0> v72 = v40[1];
    v15[1] = v13;
    v15[0] = v33;
    const s0 v87 = v39[0];
    s0 v85 = v87;
    const std::vector<double> v76 = v85.p1;
    const std::vector<double> v83 = f1(v76);
    v85.p1 = v76;
    const double v104 = v83[0];
    const s0 v380 = v72[0];
    v39[0] = v380;
    const double v211 = v25 + v104;
    return v211;
  }
  int main() {
    std::vector<s1> v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { 3.0 } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { 7.0 } } }, { { { { 8.0 }, { 9.0 }, { 10.0 } }, { 11.0 } } } }, { { { { { 12.0 }, { 13.0 }, { 14.0 } }, { 15.0 } } }, { { { { 16.0 }, { 17.0 }, { 18.0 } }, { 19.0 } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { 23.0 } } } } }, { { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { 27.0 } } }, { { { { 28.0 }, { 29.0 }, { 30.0 } }, { 31.0 } } }, { { { { 32.0 }, { 33.0 }, { 34.0 } }, { 35.0 } } } }, { { { { { 36.0 }, { 37.0 }, { 38.0 } }, { 39.0 } } }, { { { { 40.0 }, { 41.0 }, { 42.0 } }, { 43.0 } } }, { { { { 44.0 }, { 45.0 }, { 46.0 } }, { 47.0 } } } } }, { { { { { { 48.0 }, { 49.0 }, { 50.0 } }, { 51.0 } } }, { { { { 52.0 }, { 53.0 }, { 54.0 } }, { 55.0 } } }, { { { { 56.0 }, { 57.0 }, { 58.0 } }, { 59.0 } } } }, { { { { { 60.0 }, { 61.0 }, { 62.0 } }, { 63.0 } } }, { { { { 64.0 }, { 65.0 }, { 66.0 } }, { 67.0 } } }, { { { { 68.0 }, { 69.0 }, { 70.0 } }, { 71.0 } } } } } });
    double v1(72.0);
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
