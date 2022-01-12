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
    std::vector<std::vector<double>> p6;
    std::vector<std::vector<double>> p7;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4, std::vector<std::vector<double>> v5, std::vector<std::vector<double>> v6, std::vector<std::vector<double>> v7): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5), p6(v6), p7(v7) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s1 p1;
    s3(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s0 f4(const s0 &v0) {
    s0 v1 = v0;
    const std::vector<std::vector<double>> v3 = v0.p7;
    const std::vector<double> v4 = v3[0];
    const std::vector<double> v11 = v3[0];
    const std::vector<std::vector<double>> v8 = v0.p0;
    const std::vector<std::vector<double>> v14 = v0.p3;
    const std::vector<std::vector<double>> v9 = v0.p3;
    const std::vector<std::vector<double>> v15 = v0.p5;
    v1.p3 = v14;
    std::vector<std::vector<double>> v10 = v8;
    const std::vector<std::vector<double>> v7 = v0.p5;
    v10[0] = v4;
    const std::vector<std::vector<double>> v13 = v0.p1;
    std::vector<std::vector<double>> v12 = v10;
    v1.p5 = v7;
    const std::vector<double> v19 = v10[0];
    v10 = v8;
    v1.p4 = v15;
    const std::vector<std::vector<double>> v22 = v1.p7;
    v1.p5 = v9;
    s0 v28 = v0;
    const std::vector<std::vector<double>> v50 = v28.p5;
    std::vector<std::vector<double>> v21 = v12;
    v1.p1 = v13;
    v28.p7 = v7;
    const std::vector<std::vector<double>> v16 = v0.p0;
    const std::vector<double> v54 = v50[1];
    const std::vector<std::vector<double>> v20 = v1.p6;
    v21[0] = v54;
    v10 = v16;
    const std::vector<double> v27 = v21[0];
    v12[0] = v19;
    v28.p2 = v22;
    const std::vector<double> v43 = v20[0];
    v28.p7 = v3;
    v1.p3 = v50;
    v12[0] = v11;
    v10[0] = v43;
    v28.p0 = v21;
    const std::vector<std::vector<double>> v88 = v1.p7;
    v12[0] = v27;
    v28.p4 = v88;
    s0 v91 = v28;
    return v91;
  }
  s1 f2(const s1 &v0) {
    s1 v4 = v0;
    const std::vector<s0> v1 = v4.p0;
    const std::vector<s0> v2 = v0.p0;
    s1 v5 = v0;
    v4 = v0;
    std::vector<s0> v8 = v1;
    const std::vector<s0> v9 = v4.p0;
    v5.p0 = v8;
    const s0 v6 = v5.p1;
    const std::vector<s0> v13 = v5.p0;
    const s0 v10 = v2[0];
    const s0 v15 = f4(v6);
    const s1 v25(v9, v15);
    const s0 v40 = v4.p1;
    v8[1] = v40;
    v8[0] = v6;
    const s1 v29(v13, v40);
    v5.p0 = v13;
    const s0 v41 = v5.p1;
    s1 v39 = v25;
    s0 v86 = v41;
    const s0 v56 = v13[0];
    v39.p1 = v10;
    v39.p0 = v1;
    const s0 v30 = f4(v56);
    s0 v54 = v86;
    const s0 v78 = f4(v40);
    v8[0] = v30;
    const std::vector<s0> v113 = v29.p0;
    v39.p0 = v113;
    v4.p1 = v41;
    v8[1] = v78;
    s1 v125 = v39;
    std::vector<s0> v111 = v13;
    v4.p1 = v54;
    v4.p0 = v111;
    return v125;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const std::vector<s1> &v1, const s0 &v2, const std::vector<s0> &v3, const double &v4) {
    const s3 v6 = v0[0];
    const s0 v8 = f4(v2);
    const s0 v11 = f4(v2);
    const s0 v10 = v3[1];
    s3 v9 = v6;
    const std::vector<std::vector<double>> v18 = v10.p5;
    v9.p0 = v11;
    const s1 v22 = v9.p1;
    v9.p0 = v8;
    s1 v13 = v22;
    const s1 v29 = f2(v13);
    const s0 v23 = v9.p0;
    v13 = v29;
    const s0 v28 = f4(v23);
    v13.p0 = v3;
    const std::vector<double> v16 = v18[0];
    const s0 v26 = f4(v28);
    v9.p1 = v13;
    std::vector<double> v35 = v16;
    const double v52 = v16[0];
    const s0 v49 = f4(v26);
    const s0 v36 = v13.p1;
    v35[0] = v52;
    const s3 v43(v49, v13);
    const s0 v42 = f4(v49);
    const std::vector<std::vector<double>> v56 { v16, v16, v35, v16, v35 };
    v13.p1 = v23;
    const std::vector<std::vector<double>> v57 = v42.p0;
    const std::vector<double> v111 = v57[0];
    const s3 v138 = v0[0];
    v9 = v43;
    std::vector<std::vector<double>> v128 = v56;
    const std::vector<double> v69 = v56[4];
    v128 = v56;
    const std::vector<double> v125 = v128[0];
    v9 = v138;
    const std::vector<std::vector<double>> v89 { v69, v125, v125 };
    std::vector<std::vector<double>> v77 = v89;
    const s0 v150 = f4(v36);
    const std::vector<double> v196 = v77[0];
    const double v135 = v111[0];
    const double v221 = v196[0];
    const double v136 = v135 + v221;
    v9.p0 = v150;
    v13.p1 = v42;
    v35[0] = v135;
    return v136;
  }
  int main() {
    std::vector<s3> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } }, { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } }, { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { { { 15.0 } }, { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } }, { { 25.0 }, { 26.0 } }, { { 27.0 } }, { { 28.0 }, { 29.0 } } }, { { { 30.0 } }, { { 31.0 }, { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } }, { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } }, { { 40.0 }, { 41.0 } }, { { 42.0 } }, { { 43.0 }, { 44.0 } } } }, { { { 45.0 } }, { { 46.0 }, { 47.0 }, { 48.0 } }, { { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 } }, { { 53.0 }, { 54.0 } }, { { 55.0 }, { 56.0 } }, { { 57.0 } }, { { 58.0 }, { 59.0 } } } } } });
    std::vector<s1> v1({ { { { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } }, { { 64.0 }, { 65.0 } }, { { 66.0 }, { 67.0 } }, { { 68.0 }, { 69.0 } }, { { 70.0 }, { 71.0 } }, { { 72.0 } }, { { 73.0 }, { 74.0 } } }, { { { 75.0 } }, { { 76.0 }, { 77.0 }, { 78.0 } }, { { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 } }, { { 83.0 }, { 84.0 } }, { { 85.0 }, { 86.0 } }, { { 87.0 } }, { { 88.0 }, { 89.0 } } } }, { { { 90.0 } }, { { 91.0 }, { 92.0 }, { 93.0 } }, { { 94.0 }, { 95.0 } }, { { 96.0 }, { 97.0 } }, { { 98.0 }, { 99.0 } }, { { 100.0 }, { 101.0 } }, { { 102.0 } }, { { 103.0 }, { 104.0 } } } }, { { { { { 105.0 } }, { { 106.0 }, { 107.0 }, { 108.0 } }, { { 109.0 }, { 110.0 } }, { { 111.0 }, { 112.0 } }, { { 113.0 }, { 114.0 } }, { { 115.0 }, { 116.0 } }, { { 117.0 } }, { { 118.0 }, { 119.0 } } }, { { { 120.0 } }, { { 121.0 }, { 122.0 }, { 123.0 } }, { { 124.0 }, { 125.0 } }, { { 126.0 }, { 127.0 } }, { { 128.0 }, { 129.0 } }, { { 130.0 }, { 131.0 } }, { { 132.0 } }, { { 133.0 }, { 134.0 } } } }, { { { 135.0 } }, { { 136.0 }, { 137.0 }, { 138.0 } }, { { 139.0 }, { 140.0 } }, { { 141.0 }, { 142.0 } }, { { 143.0 }, { 144.0 } }, { { 145.0 }, { 146.0 } }, { { 147.0 } }, { { 148.0 }, { 149.0 } } } }, { { { { { 150.0 } }, { { 151.0 }, { 152.0 }, { 153.0 } }, { { 154.0 }, { 155.0 } }, { { 156.0 }, { 157.0 } }, { { 158.0 }, { 159.0 } }, { { 160.0 }, { 161.0 } }, { { 162.0 } }, { { 163.0 }, { 164.0 } } }, { { { 165.0 } }, { { 166.0 }, { 167.0 }, { 168.0 } }, { { 169.0 }, { 170.0 } }, { { 171.0 }, { 172.0 } }, { { 173.0 }, { 174.0 } }, { { 175.0 }, { 176.0 } }, { { 177.0 } }, { { 178.0 }, { 179.0 } } } }, { { { 180.0 } }, { { 181.0 }, { 182.0 }, { 183.0 } }, { { 184.0 }, { 185.0 } }, { { 186.0 }, { 187.0 } }, { { 188.0 }, { 189.0 } }, { { 190.0 }, { 191.0 } }, { { 192.0 } }, { { 193.0 }, { 194.0 } } } } });
    s0 v2({ { { 195.0 } }, { { 196.0 }, { 197.0 }, { 198.0 } }, { { 199.0 }, { 200.0 } }, { { 201.0 }, { 202.0 } }, { { 203.0 }, { 204.0 } }, { { 205.0 }, { 206.0 } }, { { 207.0 } }, { { 208.0 }, { 209.0 } } });
    std::vector<s0> v3({ { { { 210.0 } }, { { 211.0 }, { 212.0 }, { 213.0 } }, { { 214.0 }, { 215.0 } }, { { 216.0 }, { 217.0 } }, { { 218.0 }, { 219.0 } }, { { 220.0 }, { 221.0 } }, { { 222.0 } }, { { 223.0 }, { 224.0 } } }, { { { 225.0 } }, { { 226.0 }, { 227.0 }, { 228.0 } }, { { 229.0 }, { 230.0 } }, { { 231.0 }, { 232.0 } }, { { 233.0 }, { 234.0 } }, { { 235.0 }, { 236.0 } }, { { 237.0 } }, { { 238.0 }, { 239.0 } } } });
    double v4(240.0);
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
