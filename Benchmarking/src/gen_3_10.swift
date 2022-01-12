  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s1]
    var p1: s0
  }
  func f76(_ v0: s0) -> s0 {
    let v7: [Double] = v0.p0
    let v3: [[Double]] = v0.p1
    var v6: s0 = v0
    let v1: [Double] = v0.p0
    let v4: [[Double]] = v6.p1
    let v8: [Double] = v4[0]
    v6.p0 = v7
    v6.p1 = v3
    let v12: [Double] = v0.p0
    v6.p0 = v12
    v6.p1 = v4
    v6.p1 = v3
    v6.p0 = v12
    let v30: [[Double]] = v0.p1
    let v25: [Double] = v6.p0
    let v22: [[Double]] = v6.p1
    var v36: [[Double]] = v30
    v36[1] = v8
    v6.p1 = v36
    var v43: [[Double]] = v22
    v6.p0 = v1
    v6.p1 = v43
    var v40: [Double] = v25
    v6.p0 = v40
    var v87: s0 = v6
    let v79: s1 = s1(p0: v87, p1: v6)
    let v69: s0 = v79.p1
    return v69
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [[s3]], _ v2: Double) -> Double {
    let v5: s0 = v0.p0
    let v6: [Double] = v5.p0
    let v14: s0 = v0.p1
    let v11: Double = v6[2]
    let v25: s0 = f76(v14)
    var v23: [Double] = v6
    v23[2] = v11
    let v37: Double = v6[1]
    let v36: [Double] = v25.p0
    let v61: Double = v23[1]
    let v39: Double = v36[0]
    v23[0] = v37
    v23[0] = v39
    v23 = v6
    return v61
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [0.0, 1.0, 2.0], p1: [[3.0], [4.0], [5.0]]), p1: s0(p0: [6.0, 7.0, 8.0], p1: [[9.0], [10.0], [11.0]]))
    let v1: [[s3]] = [[s3(p0: [s1(p0: s0(p0: [12.0, 13.0, 14.0], p1: [[15.0], [16.0], [17.0]]), p1: s0(p0: [18.0, 19.0, 20.0], p1: [[21.0], [22.0], [23.0]])), s1(p0: s0(p0: [24.0, 25.0, 26.0], p1: [[27.0], [28.0], [29.0]]), p1: s0(p0: [30.0, 31.0, 32.0], p1: [[33.0], [34.0], [35.0]])), s1(p0: s0(p0: [36.0, 37.0, 38.0], p1: [[39.0], [40.0], [41.0]]), p1: s0(p0: [42.0, 43.0, 44.0], p1: [[45.0], [46.0], [47.0]]))], p1: s0(p0: [48.0, 49.0, 50.0], p1: [[51.0], [52.0], [53.0]]))], [s3(p0: [s1(p0: s0(p0: [54.0, 55.0, 56.0], p1: [[57.0], [58.0], [59.0]]), p1: s0(p0: [60.0, 61.0, 62.0], p1: [[63.0], [64.0], [65.0]])), s1(p0: s0(p0: [66.0, 67.0, 68.0], p1: [[69.0], [70.0], [71.0]]), p1: s0(p0: [72.0, 73.0, 74.0], p1: [[75.0], [76.0], [77.0]])), s1(p0: s0(p0: [78.0, 79.0, 80.0], p1: [[81.0], [82.0], [83.0]]), p1: s0(p0: [84.0, 85.0, 86.0], p1: [[87.0], [88.0], [89.0]]))], p1: s0(p0: [90.0, 91.0, 92.0], p1: [[93.0], [94.0], [95.0]]))], [s3(p0: [s1(p0: s0(p0: [96.0, 97.0, 98.0], p1: [[99.0], [100.0], [101.0]]), p1: s0(p0: [102.0, 103.0, 104.0], p1: [[105.0], [106.0], [107.0]])), s1(p0: s0(p0: [108.0, 109.0, 110.0], p1: [[111.0], [112.0], [113.0]]), p1: s0(p0: [114.0, 115.0, 116.0], p1: [[117.0], [118.0], [119.0]])), s1(p0: s0(p0: [120.0, 121.0, 122.0], p1: [[123.0], [124.0], [125.0]]), p1: s0(p0: [126.0, 127.0, 128.0], p1: [[129.0], [130.0], [131.0]]))], p1: s0(p0: [132.0, 133.0, 134.0], p1: [[135.0], [136.0], [137.0]]))]]
    let v2: Double = 138.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 138.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
