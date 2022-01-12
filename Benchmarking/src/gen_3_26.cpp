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
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s1 p1;
    s3(std::vector<s1> v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s3> p0;
    s3 p1;
    s4(std::vector<s3> v0, s3 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s4 p0;
    std::vector<s4> p1;
    s5(s4 v0, std::vector<s4> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s3 p0;
    std::vector<s1> p1;
    s7(s3 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s9 {
    std::vector<s7> p0;
    s5 p1;
    s9(std::vector<s7> v0, s5 v1): p0(v0), p1(v1) { }
  };
  double f29(const double &v0) {
    double v2 = v0;
    double v6 = v0;
    double v7 = v6;
    double v3 = v7;
    v3 = v2;
    double v1 = v7;
    double v10 = v2;
    double v9 = v3;
    double v8 = v7;
    double v18 = v7;
    double v11 = v8;
    double v14 = v10;
    double v24 = v0;
    double v15 = v9;
    v9 = v7;
    double v21 = v9;
    double v26 = v18;
    double v38 = v21;
    double v16 = v38;
    double v17 = v15;
    double v23 = v26;
    v1 = v17;
    double v40 = v2;
    double v44 = v17;
    double v34 = v23;
    double v43 = v16;
    v18 = v10;
    double v32 = v6;
    double v50 = v32;
    v7 = v24;
    const std::vector<double> v92 { v11, v50 };
    const double v28 = v92[0];
    v11 = v2;
    std::vector<double> v33 = v92;
    std::vector<double> v61 = v92;
    double v41 = v8;
    double v48 = v34;
    std::vector<double> v51 = v92;
    v21 = v48;
    v61[0] = v43;
    v51[1] = v40;
    const double v66 = v51[0];
    std::vector<double> v60 = v33;
    v33[0] = v18;
    const double v86 = v61[0];
    const std::vector<double> v65 { v44, v41 };
    const std::vector<std::vector<double>> v125 { v60, v33, v65, v33, v61, v60, v51 };
    v33[0] = v50;
    std::vector<std::vector<double>> v59 = v125;
    std::vector<double> v114 = v33;
    const double v95 = v51[1];
    std::vector<std::vector<double>> v56 = v125;
    v51[1] = v14;
    v60[1] = v86;
    std::vector<double> v98 = v114;
    std::vector<double> v64 = v114;
    std::vector<double> v71 = v64;
    v61[1] = v66;
    const double v212 = v98[1];
    std::vector<std::vector<double>> v110 = v59;
    const std::vector<std::vector<std::vector<double>>> v148 { v125, v125, v125, v56, v125 };
    v44 = v0;
    std::vector<std::vector<std::vector<double>>> v296 = v148;
    v9 = v28;
    std::vector<std::vector<double>> v53 = v110;
    const std::vector<std::vector<double>> v150 = v296[1];
    const std::vector<double> v191 = v150[2];
    std::vector<std::vector<double>> v115 = v56;
    v60[0] = v95;
    v114[0] = v50;
    const std::vector<double> v172 = v115[4];
    v59[1] = v71;
    v110[3] = v33;
    const double v119 = v172[1];
    const std::vector<double> v139 = v53[4];
    v53[3] = v191;
    v33[1] = v1;
    v32 = v212;
    v115[5] = v114;
    v115[5] = v139;
    return v119;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const s9 &v1, const double &v2) {
    const double v4 = f29(v2);
    const double v7 = f29(v4);
    const double v10 = f29(v7);
    double v13 = v4;
    const double v31 = v13 * v10;
    return v31;
  }
  int main() {
    s1 v0({ { { { { 0.0 } }, { { 1.0 } } } }, { { { 2.0 } }, { { 3.0 } } } });
    s9 v1({ { { { { { { { { { 4.0 } }, { { 5.0 } } } }, { { { 6.0 } }, { { 7.0 } } } }, { { { { { 8.0 } }, { { 9.0 } } } }, { { { 10.0 } }, { { 11.0 } } } }, { { { { { 12.0 } }, { { 13.0 } } } }, { { { 14.0 } }, { { 15.0 } } } } }, { { { { { 16.0 } }, { { 17.0 } } } }, { { { 18.0 } }, { { 19.0 } } } } }, { { { { { { 20.0 } }, { { 21.0 } } } }, { { { 22.0 } }, { { 23.0 } } } } } } }, { { { { { { { { { { 24.0 } }, { { 25.0 } } } }, { { { 26.0 } }, { { 27.0 } } } }, { { { { { 28.0 } }, { { 29.0 } } } }, { { { 30.0 } }, { { 31.0 } } } }, { { { { { 32.0 } }, { { 33.0 } } } }, { { { 34.0 } }, { { 35.0 } } } } }, { { { { { 36.0 } }, { { 37.0 } } } }, { { { 38.0 } }, { { 39.0 } } } } } }, { { { { { { { 40.0 } }, { { 41.0 } } } }, { { { 42.0 } }, { { 43.0 } } } }, { { { { { 44.0 } }, { { 45.0 } } } }, { { { 46.0 } }, { { 47.0 } } } }, { { { { { 48.0 } }, { { 49.0 } } } }, { { { 50.0 } }, { { 51.0 } } } } }, { { { { { 52.0 } }, { { 53.0 } } } }, { { { 54.0 } }, { { 55.0 } } } } } }, { { { { { { { { { { 56.0 } }, { { 57.0 } } } }, { { { 58.0 } }, { { 59.0 } } } }, { { { { { 60.0 } }, { { 61.0 } } } }, { { { 62.0 } }, { { 63.0 } } } }, { { { { { 64.0 } }, { { 65.0 } } } }, { { { 66.0 } }, { { 67.0 } } } } }, { { { { { 68.0 } }, { { 69.0 } } } }, { { { 70.0 } }, { { 71.0 } } } } } }, { { { { { { { 72.0 } }, { { 73.0 } } } }, { { { 74.0 } }, { { 75.0 } } } }, { { { { { 76.0 } }, { { 77.0 } } } }, { { { 78.0 } }, { { 79.0 } } } }, { { { { { 80.0 } }, { { 81.0 } } } }, { { { 82.0 } }, { { 83.0 } } } } }, { { { { { 84.0 } }, { { 85.0 } } } }, { { { 86.0 } }, { { 87.0 } } } } } }, { { { { { { { { { 88.0 } }, { { 89.0 } } } }, { { { 90.0 } }, { { 91.0 } } } }, { { { { { 92.0 } }, { { 93.0 } } } }, { { { 94.0 } }, { { 95.0 } } } }, { { { { { 96.0 } }, { { 97.0 } } } }, { { { 98.0 } }, { { 99.0 } } } } }, { { { { { 100.0 } }, { { 101.0 } } } }, { { { 102.0 } }, { { 103.0 } } } } } }, { { { { { { { 104.0 } }, { { 105.0 } } } }, { { { 106.0 } }, { { 107.0 } } } }, { { { { { 108.0 } }, { { 109.0 } } } }, { { { 110.0 } }, { { 111.0 } } } }, { { { { { 112.0 } }, { { 113.0 } } } }, { { { 114.0 } }, { { 115.0 } } } } }, { { { { { 116.0 } }, { { 117.0 } } } }, { { { 118.0 } }, { { 119.0 } } } } } } } } });
    double v2(120.0);
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
