  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    double p0;
    std::vector<std::vector<s2>> p1;
    s7(double v0, std::vector<std::vector<s2>> v1): p0(v0), p1(v1) { }
  };
  s0 f71(const s0 &v0) {
    s0 v5 = v0;
    s0 v4 = v5;
    s0 v6 = v0;
    const std::vector<std::vector<double>> v3 = v5.p0;
    const std::vector<std::vector<double>> v13 = v5.p1;
    const std::vector<std::vector<double>> v17 = v6.p0;
    v4.p0 = v3;
    v5.p0 = v17;
    v4.p1 = v13;
    v6.p1 = v13;
    const std::vector<std::vector<double>> v1 = v4.p3;
    v5.p1 = v13;
    const std::vector<std::vector<double>> v27 = v4.p1;
    v4.p1 = v27;
    s0 v36 = v4;
    v5.p3 = v1;
    return v36;
  }
  s7 f68(const s7 &v0) {
    s7 v6 = v0;
    const double v2 = v6.p0;
    const std::vector<double> v7 { v2, v2 };
    const double v3 = v7[1];
    v6.p0 = v3;
    const double v5 = v7[1];
    const std::vector<std::vector<s2>> v12 = v6.p1;
    const std::vector<std::vector<s2>> v8 = v6.p1;
    v6.p1 = v12;
    v6.p1 = v12;
    const double v33 = v6.p0;
    double v34 = v5;
    const std::vector<s2> v19 = v8[1];
    s7 v45 = v0;
    const s2 v16 = v19[0];
    v45.p1 = v8;
    const s0 v55 = v16.p0;
    v6.p0 = v5;
    const std::vector<std::vector<double>> v52 = v55.p2;
    v45.p0 = v3;
    v45.p0 = v2;
    std::vector<std::vector<double>> v68 = v52;
    const std::vector<double> v60 = v68[2];
    const double v36 = v60[0];
    s7 v50 = v0;
    s7 v58 = v50;
    const double v107 = v36 + v5;
    v6.p0 = v107;
    v68[1] = v60;
    const std::vector<std::vector<s2>> v88 = v6.p1;
    std::vector<std::vector<double>> v44 = v68;
    v58.p1 = v88;
    const std::vector<double> v80 = v44[2];
    v68[1] = v80;
    v6.p0 = v34;
    v58 = v45;
    v50.p1 = v88;
    v58.p0 = v33;
    v58.p1 = v8;
    v45.p0 = v33;
    return v58;
  }
  std::vector<std::vector<s2>> f59(const std::vector<std::vector<s2>> &v0) {
    std::vector<std::vector<s2>> v2 = v0;
    std::vector<std::vector<s2>> v5 = v0;
    v2 = v5;
    std::vector<std::vector<s2>> v1 = v0;
    const std::vector<std::vector<std::vector<s2>>> v3 { v1, v2, v0, v5, v1, v0 };
    const std::vector<s2> v9 = v2[2];
    v2[0] = v9;
    v1[0] = v9;
    std::vector<s2> v37 = v9;
    v2[1] = v9;
    v1[1] = v37;
    const std::vector<std::vector<s2>> v65 = v3[2];
    return v65;
  }
  s2 f50(const s2 &v0) {
    s2 v8 = v0;
    s2 v6 = v8;
    s2 v5 = v0;
    const s0 v2 = v5.p1;
    const std::vector<s2> v4 { v5, v6, v8 };
    const s0 v1 = f71(v2);
    const s0 v7 = f71(v2);
    const s0 v9 = v5.p1;
    const s0 v13 = v0.p0;
    const s2 v3 = v4[1];
    const s0 v11 = f71(v1);
    const s0 v16 = f71(v7);
    s2 v29 = v3;
    v6.p0 = v16;
    v5.p1 = v13;
    s2 v30 = v29;
    const s0 v28 = f71(v9);
    v8.p0 = v28;
    v6.p1 = v13;
    s2 v17 = v29;
    v8.p1 = v28;
    const s0 v48 = v3.p1;
    v6.p0 = v2;
    const s0 v90 = v30.p0;
    const s0 v52 = f71(v48);
    const s0 v75 = v3.p0;
    v29.p1 = v52;
    v17.p0 = v90;
    v17.p0 = v11;
    v8.p0 = v75;
    return v17;
  }
  s7 f15(const s7 &v0) {
    s7 v2 = v0;
    s7 v6 = v0;
    const s7 v8 = f68(v6);
    v6 = v8;
    s7 v5 = v6;
    const s7 v1 = f68(v0);
    const s7 v9 = f68(v1);
    const std::vector<std::vector<s2>> v7 = v0.p1;
    std::vector<std::vector<s2>> v3 = v7;
    const std::vector<std::vector<s2>> v17 = v2.p1;
    const std::vector<s2> v21 = v7[0];
    const std::vector<s2> v15 = v17[0];
    const std::vector<std::vector<s2>> v20 = v0.p1;
    s7 v18 = v1;
    const std::vector<std::vector<s2>> v12 = f59(v7);
    v5.p1 = v3;
    const std::vector<std::vector<s2>> v19 = f59(v17);
    const std::vector<std::vector<s2>> v30 = f59(v20);
    v5.p1 = v7;
    const double v13 = v0.p0;
    const s2 v16 = v21[0];
    const double v28 = v0.p0;
    const std::vector<std::vector<s2>> v51 = f59(v3);
    const std::vector<s2> v56 = v12[0];
    const s7 v37 = f68(v18);
    const std::vector<std::vector<s2>> v46 = v37.p1;
    v2.p0 = v13;
    const std::vector<std::vector<std::vector<s2>>> v24 { v51, v3, v12, v51 };
    v6.p1 = v3;
    v3[0] = v15;
    v18.p0 = v28;
    const std::vector<s2> v32 = v20[0];
    v2 = v1;
    v3 = v19;
    v3[1] = v32;
    const s2 v26 = v56[0];
    const std::vector<s2> v40 = v46[1];
    const std::vector<s2> v23 = v30[0];
    const double v31 = v5.p0;
    std::vector<s2> v49 = v23;
    const double v50 = v9.p0;
    v3[0] = v49;
    v2.p0 = v31;
    v5.p1 = v51;
    const s0 v33 = v16.p0;
    v3[0] = v21;
    const s2 v59 = v23[0];
    const std::vector<std::vector<s2>> v66 = v24[2];
    v49 = v40;
    const std::vector<std::vector<double>> v42 = v33.p2;
    const std::vector<double> v39 = v42[1];
    v2.p1 = v19;
    const std::vector<std::vector<s2>> v79 = v24[2];
    v6.p0 = v50;
    v6.p1 = v66;
    v2.p1 = v17;
    const s2 v116 = f50(v59);
    v49[0] = v116;
    v18.p1 = v3;
    v5.p1 = v79;
    const double v105 = v39[0];
    v5.p1 = v7;
    const s7 v188 = f68(v18);
    v6.p1 = v46;
    v5.p0 = v105;
    s7 v113 = v188;
    v3[1] = v15;
    v5.p1 = v7;
    v113.p1 = v3;
    v49[0] = v26;
    v18.p1 = v51;
    return v113;
  }
  __attribute__((noinline))
  double f0(const std::vector<s7> &v0, const double &v1) {
    std::vector<s7> v4 = v0;
    const s7 v7 = v4[1];
    std::vector<s7> v3 = v0;
    const s7 v5 = v3[1];
    const s7 v6 = f68(v7);
    v3[0] = v5;
    const s7 v8 = f68(v6);
    double v18 = v1;
    double v21 = v18;
    const s7 v39 = v4[1];
    const s7 v14 = f15(v5);
    const s7 v30 = v3[2];
    v18 = v21;
    const double v120 = v14.p0;
    double v94 = v1;
    const double v70 = v94 / v120;
    const double v86 = v70 * v18;
    v3[0] = v30;
    v3[2] = v39;
    v4[1] = v6;
    v3[1] = v8;
    return v86;
  }
  int main() {
    std::vector<s7> v0({ { 0.0, { { { { { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 } }, { { 14.0 }, { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 } } } } }, { { { { { 19.0 }, { 20.0 }, { 21.0 } }, { { 22.0 } }, { { 23.0 }, { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 }, { 36.0 } } } } }, { { { { { 37.0 }, { 38.0 }, { 39.0 } }, { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } }, { { 44.0 }, { 45.0 } } }, { { { 46.0 }, { 47.0 }, { 48.0 } }, { { 49.0 } }, { { 50.0 }, { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } } } } } } }, { 55.0, { { { { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } }, { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 } } }, { { { 65.0 }, { 66.0 }, { 67.0 } }, { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } }, { { 72.0 }, { 73.0 } } } } }, { { { { { 74.0 }, { 75.0 }, { 76.0 } }, { { 77.0 } }, { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 } } }, { { { 83.0 }, { 84.0 }, { 85.0 } }, { { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } }, { { 90.0 }, { 91.0 } } } } }, { { { { { 92.0 }, { 93.0 }, { 94.0 } }, { { 95.0 } }, { { 96.0 }, { 97.0 }, { 98.0 } }, { { 99.0 }, { 100.0 } } }, { { { 101.0 }, { 102.0 }, { 103.0 } }, { { 104.0 } }, { { 105.0 }, { 106.0 }, { 107.0 } }, { { 108.0 }, { 109.0 } } } } } } }, { 110.0, { { { { { { 111.0 }, { 112.0 }, { 113.0 } }, { { 114.0 } }, { { 115.0 }, { 116.0 }, { 117.0 } }, { { 118.0 }, { 119.0 } } }, { { { 120.0 }, { 121.0 }, { 122.0 } }, { { 123.0 } }, { { 124.0 }, { 125.0 }, { 126.0 } }, { { 127.0 }, { 128.0 } } } } }, { { { { { 129.0 }, { 130.0 }, { 131.0 } }, { { 132.0 } }, { { 133.0 }, { 134.0 }, { 135.0 } }, { { 136.0 }, { 137.0 } } }, { { { 138.0 }, { 139.0 }, { 140.0 } }, { { 141.0 } }, { { 142.0 }, { 143.0 }, { 144.0 } }, { { 145.0 }, { 146.0 } } } } }, { { { { { 147.0 }, { 148.0 }, { 149.0 } }, { { 150.0 } }, { { 151.0 }, { 152.0 }, { 153.0 } }, { { 154.0 }, { 155.0 } } }, { { { 156.0 }, { 157.0 }, { 158.0 } }, { { 159.0 } }, { { 160.0 }, { 161.0 }, { 162.0 } }, { { 163.0 }, { 164.0 } } } } } } } });
    double v1(165.0);
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
