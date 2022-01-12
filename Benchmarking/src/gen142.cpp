  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    std::vector<std::vector<s2>> p2;
    s3(s0 v0, std::vector<std::vector<s0>> v1, std::vector<std::vector<s2>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s7 {
    s3 p0;
    std::vector<std::vector<s3>> p1;
    s7(s3 v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  s3 f115(const s3 &v0) {
    s3 v4 = v0;
    v4 = v0;
    const std::vector<std::vector<s2>> v2 = v4.p2;
    s3 v5 = v4;
    v5.p2 = v2;
    v5.p2 = v2;
    const std::vector<s2> v8 = v2[0];
    std::vector<std::vector<s2>> v3 = v2;
    s3 v1 = v5;
    v3[0] = v8;
    const std::vector<s2> v10 = v2[2];
    v4.p2 = v3;
    v3[2] = v10;
    v5.p2 = v3;
    v3[1] = v10;
    const std::vector<std::vector<s0>> v7 = v5.p1;
    v5.p2 = v2;
    v1.p1 = v7;
    const std::vector<std::vector<s2>> v9 = v5.p2;
    const std::vector<std::vector<s0>> v27 = v5.p1;
    std::vector<std::vector<s2>> v12 = v9;
    const std::vector<s2> v67 = v12[1];
    v1.p1 = v27;
    v1.p1 = v7;
    v3[1] = v67;
    v12[0] = v10;
    return v1;
  }
  s0 f103(const s0 &v0) {
    const std::vector<std::vector<double>> v5 = v0.p0;
    const std::vector<std::vector<double>> v1 = v0.p1;
    const s2 v7(v0, v0);
    s0 v4 = v0;
    s2 v3 = v7;
    v3.p0 = v0;
    s2 v6 = v7;
    std::vector<std::vector<double>> v2 = v5;
    const std::vector<std::vector<double>> v19 = v4.p0;
    s0 v10 = v0;
    const std::vector<std::vector<double>> v15 = v10.p1;
    const std::vector<double> v12 = v1[2];
    v6.p1 = v10;
    s0 v14 = v10;
    s2 v16 = v7;
    const s0 v17 = v7.p1;
    const s0 v35 = v6.p1;
    const std::vector<std::vector<double>> v41 = v35.p0;
    v14.p1 = v15;
    const s0 v25 = v16.p0;
    const std::vector<double> v39 = v5[1];
    const double v21 = v12[0];
    v4.p0 = v2;
    v6 = v3;
    const s2 v34(v14, v14);
    v14.p0 = v5;
    v6.p0 = v25;
    const std::vector<double> v95 = v41[1];
    const s0 v44 = v7.p0;
    v2[1] = v95;
    v10 = v14;
    s2 v60 = v34;
    double v101 = v21;
    s0 v42 = v44;
    v6.p0 = v42;
    v60.p0 = v4;
    v4 = v17;
    const std::vector<std::vector<double>> v79 = v14.p1;
    std::vector<double> v125 = v39;
    v10.p0 = v19;
    v2[0] = v125;
    v4.p1 = v79;
    const s0 v85 = v60.p1;
    v125[0] = v101;
    return v85;
  }
  s3 f101(const s3 &v0, const std::vector<s7> &v1) {
    const s3 v5 = f115(v0);
    const s3 v12 = f115(v5);
    const s3 v15 = f115(v5);
    const s0 v29 = v5.p0;
    const std::vector<std::vector<s0>> v21 = v12.p1;
    const s3 v28 = f115(v12);
    const std::vector<std::vector<double>> v24 = v29.p1;
    std::vector<std::vector<double>> v54 = v24;
    const s3 v85 = f115(v28);
    s3 v27 = v15;
    const std::vector<double> v53 = v54[0];
    s0 v50 = v29;
    v50.p1 = v54;
    v27.p0 = v50;
    const s0 v68 = v85.p0;
    v54[1] = v53;
    v27.p0 = v68;
    v27.p0 = v29;
    v27.p1 = v21;
    const s3 v90 = f115(v27);
    return v90;
  }
  __attribute__((noinline))
  double f0(const std::vector<s7> &v0, const double &v1) {
    const s7 v2 = v0[1];
    const s3 v6 = v2.p0;
    const s3 v3 = f101(v6, v0);
    const s7 v10 = v0[0];
    const s3 v36 = f101(v3, v0);
    const s0 v27 = v36.p0;
    s0 v22 = v27;
    const s0 v46 = v6.p0;
    const std::vector<std::vector<double>> v26 = v46.p1;
    v22.p1 = v26;
    v22 = v27;
    const s0 v65 = f103(v22);
    const std::vector<std::vector<double>> v62 = v65.p1;
    v22.p1 = v62;
    const s3 v53 = v10.p0;
    const std::vector<std::vector<double>> v174 = v27.p1;
    v22.p1 = v174;
    const std::vector<double> v111 = v62[0];
    const double v90 = v111[0];
    const s0 v119 = v53.p0;
    const std::vector<std::vector<double>> v197 = v119.p1;
    v22.p1 = v197;
    v22.p1 = v174;
    v22.p1 = v197;
    return v90;
  }
  int main() {
    std::vector<s7> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } } }, { { { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } } }, { { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } } } }, { { { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } } } } } }, { { { { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } }, { { { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } } }, { { { { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } }, { { { { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } } }, { { { 65.0 }, { 66.0 } }, { { 67.0 }, { 68.0 }, { 69.0 } } } } }, { { { { { 70.0 }, { 71.0 } }, { { 72.0 }, { 73.0 }, { 74.0 } } }, { { { 75.0 }, { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } } } }, { { { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 }, { 84.0 } } }, { { { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } } } } } } } } }, { { { { { 90.0 }, { 91.0 } }, { { 92.0 }, { 93.0 }, { 94.0 } } }, { { { { { 95.0 }, { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } } }, { { { { 100.0 }, { 101.0 } }, { { 102.0 }, { 103.0 }, { 104.0 } } } } }, { { { { { { 105.0 }, { 106.0 } }, { { 107.0 }, { 108.0 }, { 109.0 } } }, { { { 110.0 }, { 111.0 } }, { { 112.0 }, { 113.0 }, { 114.0 } } } } }, { { { { { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } }, { { { 120.0 }, { 121.0 } }, { { 122.0 }, { 123.0 }, { 124.0 } } } } }, { { { { { 125.0 }, { 126.0 } }, { { 127.0 }, { 128.0 }, { 129.0 } } }, { { { 130.0 }, { 131.0 } }, { { 132.0 }, { 133.0 }, { 134.0 } } } } } } }, { { { { { { 135.0 }, { 136.0 } }, { { 137.0 }, { 138.0 }, { 139.0 } } }, { { { { { 140.0 }, { 141.0 } }, { { 142.0 }, { 143.0 }, { 144.0 } } } }, { { { { 145.0 }, { 146.0 } }, { { 147.0 }, { 148.0 }, { 149.0 } } } } }, { { { { { { 150.0 }, { 151.0 } }, { { 152.0 }, { 153.0 }, { 154.0 } } }, { { { 155.0 }, { 156.0 } }, { { 157.0 }, { 158.0 }, { 159.0 } } } } }, { { { { { 160.0 }, { 161.0 } }, { { 162.0 }, { 163.0 }, { 164.0 } } }, { { { 165.0 }, { 166.0 } }, { { 167.0 }, { 168.0 }, { 169.0 } } } } }, { { { { { 170.0 }, { 171.0 } }, { { 172.0 }, { 173.0 }, { 174.0 } } }, { { { 175.0 }, { 176.0 } }, { { 177.0 }, { 178.0 }, { 179.0 } } } } } } } } } }, { { { { { 180.0 }, { 181.0 } }, { { 182.0 }, { 183.0 }, { 184.0 } } }, { { { { { 185.0 }, { 186.0 } }, { { 187.0 }, { 188.0 }, { 189.0 } } } }, { { { { 190.0 }, { 191.0 } }, { { 192.0 }, { 193.0 }, { 194.0 } } } } }, { { { { { { 195.0 }, { 196.0 } }, { { 197.0 }, { 198.0 }, { 199.0 } } }, { { { 200.0 }, { 201.0 } }, { { 202.0 }, { 203.0 }, { 204.0 } } } } }, { { { { { 205.0 }, { 206.0 } }, { { 207.0 }, { 208.0 }, { 209.0 } } }, { { { 210.0 }, { 211.0 } }, { { 212.0 }, { 213.0 }, { 214.0 } } } } }, { { { { { 215.0 }, { 216.0 } }, { { 217.0 }, { 218.0 }, { 219.0 } } }, { { { 220.0 }, { 221.0 } }, { { 222.0 }, { 223.0 }, { 224.0 } } } } } } }, { { { { { { 225.0 }, { 226.0 } }, { { 227.0 }, { 228.0 }, { 229.0 } } }, { { { { { 230.0 }, { 231.0 } }, { { 232.0 }, { 233.0 }, { 234.0 } } } }, { { { { 235.0 }, { 236.0 } }, { { 237.0 }, { 238.0 }, { 239.0 } } } } }, { { { { { { 240.0 }, { 241.0 } }, { { 242.0 }, { 243.0 }, { 244.0 } } }, { { { 245.0 }, { 246.0 } }, { { 247.0 }, { 248.0 }, { 249.0 } } } } }, { { { { { 250.0 }, { 251.0 } }, { { 252.0 }, { 253.0 }, { 254.0 } } }, { { { 255.0 }, { 256.0 } }, { { 257.0 }, { 258.0 }, { 259.0 } } } } }, { { { { { 260.0 }, { 261.0 } }, { { 262.0 }, { 263.0 }, { 264.0 } } }, { { { 265.0 }, { 266.0 } }, { { 267.0 }, { 268.0 }, { 269.0 } } } } } } } } } } });
    double v1(270.0);
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
