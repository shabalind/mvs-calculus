  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    std::vector<std::vector<double>> p5;
    std::vector<double> p6;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4, std::vector<std::vector<double>> v5, std::vector<double> v6): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6) { }
  };
  struct s3 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s3(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f23(const double &v0) {
    double v7 = v0;
    double v6 = v0;
    double v3 = v7;
    double v4 = v3;
    const double v2 = v3 - v4;
    const std::vector<double> v5 { v6 };
    double v10 = v6;
    const double v17 = v5[0];
    std::vector<double> v12 = v5;
    const double v32 = v12[0];
    std::vector<double> v14 = v5;
    const double v19 = v5[0];
    std::vector<double> v22 = v14;
    const double v18 = v0 * v17;
    v22 = v12;
    std::vector<double> v71 = v12;
    std::vector<double> v21 = v5;
    v21 = v5;
    v71[0] = v0;
    const double v41 = v71[0];
    const double v16 = v14[0];
    const double v24 = v14[0];
    const double v23 = v71[0];
    double v35 = v23;
    v12[0] = v17;
    v12[0] = v16;
    v22[0] = v35;
    std::vector<double> v28 = v14;
    std::vector<double> v53 = v21;
    std::vector<double> v47 = v12;
    std::vector<double> v30 = v28;
    std::vector<double> v50 = v12;
    v14[0] = v19;
    v14[0] = v10;
    const double v51 = v30[0];
    v22[0] = v41;
    const double v59 = v71[0];
    const double v78 = v71[0];
    v14 = v50;
    std::vector<double> v31 = v47;
    const double v95 = v28[0];
    v22[0] = v24;
    std::vector<double> v205 = v28;
    std::vector<double> v46 = v50;
    v50[0] = v59;
    v14[0] = v32;
    v14[0] = v51;
    double v55 = v78;
    const double v103 = v31[0];
    v47[0] = v95;
    const std::vector<std::vector<double>> v44 { v50, v205, v53, v28 };
    const std::vector<double> v52 = v44[0];
    v46[0] = v18;
    v30[0] = v103;
    const double v104 = v31[0];
    v22[0] = v4;
    v28[0] = v24;
    std::vector<double> v176 = v52;
    v50[0] = v2;
    v21[0] = v104;
    const double v278 = v46[0];
    v46[0] = v41;
    const double v144 = v22[0];
    const double v141 = v176[0];
    double v54 = v55;
    v53[0] = v278;
    const double v215 = v22[0];
    v28[0] = v54;
    v47[0] = v144;
    v71[0] = v215;
    return v141;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const double v8 = f23(v1);
    const double v7 = f23(v8);
    double v11 = v8;
    const std::vector<double> v9 { v7, v11 };
    const double v20 = v9[1];
    const double v38 = v7 - v20;
    return v38;
  }
  int main() {
    s3 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 }, { 12.0 }, { 13.0 } }, { { 14.0 } }, { 15.0, 16.0 } } }, { { { { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } }, { 32.0, 33.0 } } }, { { { { 34.0 }, { 35.0 } }, { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 } }, { 49.0, 50.0 } } } }, { { { { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } }, { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 }, { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } }, { { 65.0 } }, { 66.0, 67.0 } }, { { { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 }, { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } }, { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 }, { 80.0 }, { 81.0 } }, { { 82.0 } }, { 83.0, 84.0 } }, { { { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } }, { { 90.0 }, { 91.0 }, { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } }, { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 } }, { 100.0, 101.0 } } } });
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
