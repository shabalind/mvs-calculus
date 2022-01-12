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
    s0 p0;
    std::vector<std::vector<s1>> p1;
    s2(s0 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s2> p0;
    s3(std::vector<s2> v0): p0(v0) { }
  };
  struct s4 {
    std::vector<s3> p0;
    s3 p1;
    s4(std::vector<s3> v0, s3 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s4 p0;
    std::vector<std::vector<s2>> p1;
    s5(s4 v0, std::vector<std::vector<s2>> v1): p0(v0), p1(v1) { }
  };
  double f96(const double &v0) {
    double v7 = v0;
    double v6 = v7;
    double v8 = v6;
    double v1 = v7;
    double v5 = v6;
    const std::vector<double> v2 { v6, v5 };
    v8 = v1;
    double v3 = v7;
    std::vector<double> v11 = v2;
    const double v13 = v11[1];
    v8 = v3;
    v11[0] = v8;
    v11[0] = v13;
    const double v16 = v11[1];
    return v16;
  }
  double f10(const double &v0) {
    double v4 = v0;
    const double v6 = f96(v4);
    const double v3 = f96(v4);
    const double v2 = f96(v4);
    double v5 = v3;
    const double v9 = f96(v5);
    double v10 = v6;
    double v11 = v0;
    const double v1 = v2 + v4;
    const double v13 = f96(v6);
    const double v17 = f96(v0);
    const double v8 = f96(v17);
    double v7 = v1;
    const double v15 = f96(v1);
    const double v22 = f96(v11);
    double v12 = v6;
    const double v36 = v0 / v9;
    const double v25 = f96(v6);
    const double v30 = v15 / v8;
    double v29 = v12;
    double v14 = v4;
    const double v20 = f96(v10);
    const double v31 = f96(v13);
    double v26 = v29;
    const double v52 = f96(v25);
    const double v50 = v52 * v20;
    const double v43 = v50 / v2;
    const double v73 = f96(v50);
    double v27 = v31;
    const double v46 = f96(v9);
    const std::vector<double> v34 { v46, v13, v7, v73, v30 };
    const double v59 = v34[4];
    std::vector<double> v62 = v34;
    v62[2] = v59;
    v62[3] = v8;
    double v49 = v22;
    const double v40 = f96(v49);
    v62[3] = v73;
    const double v56 = f96(v40);
    const double v60 = v62[2];
    const double v71 = f96(v31);
    std::vector<double> v51 = v34;
    v62[0] = v71;
    v62[1] = v3;
    const double v81 = v62[1];
    const double v67 = v34[0];
    v62[1] = v14;
    const double v82 = v51[2];
    std::vector<double> v111 = v51;
    v51[2] = v36;
    v51[3] = v31;
    std::vector<double> v115 = v111;
    const double v96 = f96(v60);
    std::vector<double> v45 = v115;
    const double v120 = f96(v5);
    v111[2] = v82;
    v45 = v34;
    v45[4] = v14;
    const double v174 = f96(v120);
    v45[0] = v50;
    const double v86 = v45[2];
    v62[2] = v81;
    v62[3] = v27;
    v115[1] = v174;
    v62[4] = v26;
    v51[0] = v43;
    v45[0] = v96;
    v115[2] = v67;
    v4 = v3;
    const double v119 = f96(v86);
    v111[3] = v2;
    v111[1] = v56;
    v45[4] = v120;
    return v119;
  }
  __attribute__((noinline))
  double f0(const std::vector<s5> &v0, const double &v1) {
    double v7 = v1;
    v7 = v1;
    const double v2 = v7 * v1;
    const double v31 = f96(v2);
    double v37 = v31;
    double v66 = v2;
    const double v95 = v66 - v1;
    const double v92 = v95 + v7;
    const double v61 = f10(v92);
    const double v154 = v61 * v37;
    return v154;
  }
  int main() {
    std::vector<s5> v0({ { { { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } } } } } }, { { { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } } } } }, { { { { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } }, { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } } } } } } }, { { { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } } } } } } }, { { { { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } }, { { { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } }, { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } } } } } }, { { { { { { { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } }, { { { { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } }, { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } } } } } } }, { { { { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } }, { { { { { { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } }, { { { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } } } } } } }, { { { { { { 84.0 } }, { { 85.0 }, { 86.0 }, { 87.0 } } }, { { { { { { 88.0 } }, { { 89.0 }, { 90.0 }, { 91.0 } } }, { { { 92.0 } }, { { 93.0 }, { 94.0 }, { 95.0 } } } } } } } } } }, { { { { { { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } }, { { { { { { 100.0 } }, { { 101.0 }, { 102.0 }, { 103.0 } } }, { { { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } } } } } } } } } }, { { { { { { 108.0 } }, { { 109.0 }, { 110.0 }, { 111.0 } } }, { { { { { { 112.0 } }, { { 113.0 }, { 114.0 }, { 115.0 } } }, { { { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } } } } } } } } });
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
