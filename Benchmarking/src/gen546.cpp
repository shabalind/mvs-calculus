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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s1> p0;
    std::vector<s1> p1;
    s4(std::vector<s1> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    s4 p0;
    std::vector<s0> p1;
    s9(s4 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f75(const double &v0) {
    double v3 = v0;
    double v4 = v3;
    double v2 = v4;
    double v7 = v3;
    double v5 = v4;
    double v9 = v4;
    double v1 = v0;
    double v8 = v9;
    const double v12 = v5 + v5;
    const std::vector<double> v13 { v7, v5, v9, v8 };
    std::vector<double> v21 = v13;
    v21[1] = v2;
    v3 = v1;
    v21[2] = v7;
    v21[3] = v12;
    double v15 = v5;
    const double v17 = v13[1];
    std::vector<double> v23 = v13;
    std::vector<double> v42 = v21;
    v23[0] = v17;
    const double v32 = v13[0];
    v23[3] = v15;
    double v29 = v15;
    const double v50 = v13[0];
    std::vector<double> v51 = v42;
    const std::vector<double> v35 { v32, v50, v1, v5, v4, v1 };
    std::vector<double> v48 = v51;
    std::vector<double> v56 = v35;
    v42[3] = v1;
    const double v86 = v56[1];
    v51[2] = v86;
    v51 = v23;
    const double v59 = v48[0];
    v42[3] = v29;
    return v59;
  }
  double f26(const double &v0) {
    double v6 = v0;
    double v3 = v0;
    const double v5 = f75(v6);
    const double v8 = f75(v0);
    const double v1 = f75(v3);
    const double v4 = f75(v1);
    double v7 = v6;
    double v2 = v8;
    double v9 = v2;
    const double v25 = f75(v5);
    double v14 = v8;
    const double v15 = f75(v5);
    const double v11 = f75(v3);
    const double v21 = f75(v5);
    double v13 = v21;
    const double v10 = f75(v8);
    const double v19 = f75(v9);
    const double v23 = f75(v0);
    const double v26 = f75(v11);
    const double v31 = f75(v26);
    double v27 = v25;
    const std::vector<double> v33 { v10, v19, v14, v31, v6, v5, v26 };
    std::vector<double> v40 = v33;
    const double v55 = v27 - v4;
    const double v38 = v33[6];
    std::vector<double> v22 = v40;
    v22[4] = v55;
    std::vector<double> v56 = v22;
    const double v103 = v56[2];
    v40[1] = v15;
    const double v91 = v22[4];
    std::vector<double> v36 = v40;
    double v57 = v23;
    v22[2] = v55;
    const double v69 = f75(v11);
    std::vector<double> v35 = v56;
    const double v45 = v36[5];
    double v34 = v91;
    v56[0] = v3;
    const std::vector<double> v47 { v0, v57, v25 };
    v40[1] = v7;
    std::vector<double> v68 = v47;
    const double v42 = f75(v69);
    v68[2] = v31;
    v68[0] = v13;
    const double v54 = v68[0];
    v40[0] = v54;
    v36[1] = v34;
    const double v134 = v45 / v103;
    const double v141 = f75(v15);
    v36[1] = v141;
    v40 = v35;
    const double v79 = f75(v42);
    const double v210 = f75(v134);
    v68[0] = v23;
    v68[2] = v79;
    v36 = v35;
    v36[6] = v38;
    return v210;
  }
  __attribute__((noinline))
  double f0(const s9 &v0, const double &v1) {
    const double v6 = f26(v1);
    const double v113 = f75(v6);
    return v113;
  }
  int main() {
    s9 v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } } }, { { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } }, { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } } } }, { { { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } }, { { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } } }, { { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } }, { { { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } }, { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } }, { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } }, { { { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } } }, { { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } } } } } }, { { { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } }, { { { 84.0 } }, { { 85.0 }, { 86.0 }, { 87.0 } } } } });
    double v1(88.0);
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
