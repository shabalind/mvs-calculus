  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s1> p1;
    s2(s1 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    std::vector<s0> p1;
    s3(s2 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s2 p0;
    s2 p1;
    s4(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  s3 f87(const s3 &v0, const s3 &v1, const s3 &v2) {
    const s2 v7 = v0.p0;
    s2 v6 = v7;
    s3 v9 = v0;
    const std::vector<s1> v4 = v6.p1;
    const std::vector<std::vector<s1>> v3 { v4, v4, v4, v4, v4 };
    s2 v13 = v7;
    v9.p0 = v7;
    s3 v8 = v9;
    std::vector<s1> v10 = v4;
    const s2 v14 = v2.p0;
    const std::vector<s1> v12 = v3[3];
    const s1 v29 = v14.p0;
    v10[2] = v29;
    s2 v37 = v13;
    s2 v19 = v14;
    const s1 v26 = v6.p0;
    v37.p0 = v29;
    s3 v35 = v8;
    const s1 v27 = v10[1];
    v19.p1 = v12;
    const std::vector<s0> v54 = v8.p1;
    s1 v40 = v27;
    v9 = v2;
    v13.p1 = v10;
    v19.p0 = v40;
    v8.p0 = v37;
    const std::vector<s2> v44 { v19, v7, v7, v6, v13 };
    const s2 v49 = v35.p0;
    const s2 v20 = v44[4];
    v35.p0 = v49;
    v35.p1 = v54;
    const std::vector<s0> v65 = v26.p1;
    v19.p0 = v40;
    const s2 v68 = v35.p0;
    v13.p0 = v27;
    v6 = v20;
    const s1 v55 = v4[2];
    v8.p0 = v68;
    v40.p1 = v65;
    const s2 v96 = v8.p0;
    v37.p1 = v10;
    const std::vector<s1> v117 = v96.p1;
    v10 = v117;
    v40 = v55;
    v35.p0 = v49;
    const s1 v75 = v96.p0;
    v8 = v9;
    const std::vector<s0> v118 = v75.p1;
    v19.p1 = v4;
    v40.p1 = v65;
    v6.p0 = v40;
    v40.p1 = v118;
    return v8;
  }
  s4 f86(const s3 &v0, const s4 &v1, const s2 &v2) {
    s4 v21 = v1;
    return v21;
  }
  s3 f85(const s3 &v0) {
    const s3 v5 = f87(v0, v0, v0);
    const s3 v4 = f87(v5, v5, v0);
    s3 v2 = v0;
    s3 v3 = v0;
    v2 = v4;
    const std::vector<s0> v1 = v3.p1;
    const s3 v8 = f87(v5, v0, v5);
    v3.p1 = v1;
    const s3 v14 = f87(v2, v3, v5);
    s3 v11 = v4;
    const s3 v17 = f87(v0, v0, v2);
    const s3 v22 = f87(v0, v14, v0);
    const s2 v21 = v5.p0;
    s2 v16 = v21;
    const s3 v47 = f87(v8, v11, v4);
    const s3 v19 = f87(v47, v3, v8);
    v3 = v47;
    v2.p1 = v1;
    v3 = v47;
    const s3 v24 = f87(v4, v22, v3);
    const std::vector<s0> v28 = v17.p1;
    s3 v45 = v4;
    const s3 v49 = f87(v14, v3, v11);
    const s3 v40 = f87(v14, v8, v19);
    const std::vector<s0> v34 = v0.p1;
    const s3 v43 = f87(v40, v24, v11);
    s2 v58 = v16;
    v58 = v21;
    const s3 v78 = f87(v11, v3, v17);
    const s3 v57 = f87(v47, v3, v78);
    v45.p0 = v21;
    const s3 v32 = f87(v43, v4, v8);
    const s3 v79 = f87(v57, v47, v43);
    const s3 v102 = f87(v5, v40, v11);
    v45.p1 = v34;
    const s3 v77 = f87(v8, v8, v14);
    std::vector<s0> v170 = v28;
    v45.p0 = v58;
    const s3 v70 = f87(v57, v79, v22);
    const s3 v111 = f87(v77, v32, v49);
    const s3 v129 = f87(v43, v77, v102);
    const s3 v130 = f87(v70, v129, v47);
    const s3 v122 = f87(v102, v0, v111);
    s3 v200 = v47;
    v200.p1 = v170;
    const s3 v142 = f87(v45, v122, v200);
    const s3 v216 = f87(v130, v70, v142);
    return v216;
  }
  s3 f77(const s3 &v0) {
    const s2 v3 = v0.p0;
    const s3 v1 = f85(v0);
    s3 v6 = v1;
    v6.p0 = v3;
    const s4 v8(v3, v3);
    const s4 v15 = f86(v0, v8, v3);
    const s2 v49 = v15.p0;
    v6.p0 = v49;
    return v6;
  }
  s3 f35(const s3 &v0) {
    const s3 v4 = f77(v0);
    s3 v5 = v4;
    s3 v6 = v5;
    const s3 v7 = f87(v0, v0, v6);
    const s3 v1 = f87(v6, v7, v5);
    return v1;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const std::vector<std::vector<s3>> &v1, const s1 &v2, const s2 &v3, const double &v4) {
    const std::vector<s3> v6 = v1[0];
    const s3 v17 = v6[0];
    const std::vector<s3> v9 = v1[0];
    const s3 v15 = f35(v17);
    s3 v34 = v15;
    v34.p0 = v3;
    const s3 v21 = v9[0];
    const std::vector<s0> v61 = v34.p1;
    v34.p0 = v3;
    s3 v104 = v21;
    const s0 v66 = v61[1];
    const std::vector<std::vector<double>> v80 = v66.p0;
    const std::vector<double> v101 = v80[0];
    const double v109 = v101[0];
    const double v127 = v4 - v4;
    const std::vector<s0> v108 = v104.p1;
    v104 = v15;
    const double v135 = v109 + v127;
    v34.p1 = v108;
    return v135;
  }
  int main() {
    s3 v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } } }, { { { { { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } }, { { { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } }, { { { { { { 18.0 } }, { { 19.0 }, { 20.0 } } } } }, { { { { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 } } } } }, { { { { { { 27.0 } }, { { 28.0 }, { 29.0 } } } } }, { { { { 30.0 } }, { { 31.0 }, { 32.0 } } }, { { { 33.0 } }, { { 34.0 }, { 35.0 } } } } } } }, { { { { 36.0 } }, { { 37.0 }, { 38.0 } } }, { { { 39.0 } }, { { 40.0 }, { 41.0 } } }, { { { 42.0 } }, { { 43.0 }, { 44.0 } } } } });
    std::vector<std::vector<s3>> v1({ { { { { { { { { { 45.0 } }, { { 46.0 }, { 47.0 } } } } }, { { { { 48.0 } }, { { 49.0 }, { 50.0 } } }, { { { 51.0 } }, { { 52.0 }, { 53.0 } } } } }, { { { { { { { 54.0 } }, { { 55.0 }, { 56.0 } } } } }, { { { { 57.0 } }, { { 58.0 }, { 59.0 } } }, { { { 60.0 } }, { { 61.0 }, { 62.0 } } } } }, { { { { { { 63.0 } }, { { 64.0 }, { 65.0 } } } } }, { { { { 66.0 } }, { { 67.0 }, { 68.0 } } }, { { { 69.0 } }, { { 70.0 }, { 71.0 } } } } }, { { { { { { 72.0 } }, { { 73.0 }, { 74.0 } } } } }, { { { { 75.0 } }, { { 76.0 }, { 77.0 } } }, { { { 78.0 } }, { { 79.0 }, { 80.0 } } } } } } }, { { { { 81.0 } }, { { 82.0 }, { 83.0 } } }, { { { 84.0 } }, { { 85.0 }, { 86.0 } } }, { { { 87.0 } }, { { 88.0 }, { 89.0 } } } } } } });
    s1 v2({ { { { { { 90.0 } }, { { 91.0 }, { 92.0 } } } } }, { { { { 93.0 } }, { { 94.0 }, { 95.0 } } }, { { { 96.0 } }, { { 97.0 }, { 98.0 } } } } });
    s2 v3({ { { { { { { 99.0 } }, { { 100.0 }, { 101.0 } } } } }, { { { { 102.0 } }, { { 103.0 }, { 104.0 } } }, { { { 105.0 } }, { { 106.0 }, { 107.0 } } } } }, { { { { { { { 108.0 } }, { { 109.0 }, { 110.0 } } } } }, { { { { 111.0 } }, { { 112.0 }, { 113.0 } } }, { { { 114.0 } }, { { 115.0 }, { 116.0 } } } } }, { { { { { { 117.0 } }, { { 118.0 }, { 119.0 } } } } }, { { { { 120.0 } }, { { 121.0 }, { 122.0 } } }, { { { 123.0 } }, { { 124.0 }, { 125.0 } } } } }, { { { { { { 126.0 } }, { { 127.0 }, { 128.0 } } } } }, { { { { 129.0 } }, { { 130.0 }, { 131.0 } } }, { { { 132.0 } }, { { 133.0 }, { 134.0 } } } } } } });
    double v4(135.0);
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
