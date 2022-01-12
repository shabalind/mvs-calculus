  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s3 {
    var p0: s0
    var p1: s1
  }
  struct s4 {
    var p0: [s1]
    var p1: [s0]
    var p2: s3
    var p3: [s3]
  }
  struct s7 {
    var p0: [s1]
    var p1: s4
  }
  func f32(_ v0: Double) -> Double {
    var v2: Double = v0
    let v7: Double = v2 + v2
    var v5: Double = v0
    var v4: Double = v7
    var v1: Double = v0
    v1 = v5
    var v3: Double = v4
    var v6: Double = v7
    var v15: Double = v5
    let v16: Double = v2 + v2
    let v12: Double = v1 / v16
    var v8: Double = v16
    var v10: Double = v7
    v5 = v6
    var v17: Double = v12
    var v35: Double = v17
    let v18: [Double] = [v2, v15, v3, v10, v8, v35, v4]
    var v40: [Double] = v18
    let v27: Double = v40[0]
    return v27
  }
  @inline(never)
  func f0(_ v0: [[s7]], _ v1: Double) -> Double {
    let v2: Double = f32(v1)
    let v10: Double = f32(v2)
    let v7: Double = f32(v1)
    var v13: Double = v10
    let v24: Double = f32(v7)
    let v22: Double = v1 * v13
    let v39: Double = f32(v24)
    let v48: Double = v39 + v22
    return v48
  }
  func benchmark() {
    let v0: [[s7]] = [[s7(p0: [s1(p0: [s0(p0: [[0.0], [1.0]], p1: 2.0)], p1: [[s0(p0: [[3.0], [4.0]], p1: 5.0)], [s0(p0: [[6.0], [7.0]], p1: 8.0)]])], p1: s4(p0: [s1(p0: [s0(p0: [[9.0], [10.0]], p1: 11.0)], p1: [[s0(p0: [[12.0], [13.0]], p1: 14.0)], [s0(p0: [[15.0], [16.0]], p1: 17.0)]])], p1: [s0(p0: [[18.0], [19.0]], p1: 20.0), s0(p0: [[21.0], [22.0]], p1: 23.0)], p2: s3(p0: s0(p0: [[24.0], [25.0]], p1: 26.0), p1: s1(p0: [s0(p0: [[27.0], [28.0]], p1: 29.0)], p1: [[s0(p0: [[30.0], [31.0]], p1: 32.0)], [s0(p0: [[33.0], [34.0]], p1: 35.0)]])), p3: [s3(p0: s0(p0: [[36.0], [37.0]], p1: 38.0), p1: s1(p0: [s0(p0: [[39.0], [40.0]], p1: 41.0)], p1: [[s0(p0: [[42.0], [43.0]], p1: 44.0)], [s0(p0: [[45.0], [46.0]], p1: 47.0)]])), s3(p0: s0(p0: [[48.0], [49.0]], p1: 50.0), p1: s1(p0: [s0(p0: [[51.0], [52.0]], p1: 53.0)], p1: [[s0(p0: [[54.0], [55.0]], p1: 56.0)], [s0(p0: [[57.0], [58.0]], p1: 59.0)]]))]))], [s7(p0: [s1(p0: [s0(p0: [[60.0], [61.0]], p1: 62.0)], p1: [[s0(p0: [[63.0], [64.0]], p1: 65.0)], [s0(p0: [[66.0], [67.0]], p1: 68.0)]])], p1: s4(p0: [s1(p0: [s0(p0: [[69.0], [70.0]], p1: 71.0)], p1: [[s0(p0: [[72.0], [73.0]], p1: 74.0)], [s0(p0: [[75.0], [76.0]], p1: 77.0)]])], p1: [s0(p0: [[78.0], [79.0]], p1: 80.0), s0(p0: [[81.0], [82.0]], p1: 83.0)], p2: s3(p0: s0(p0: [[84.0], [85.0]], p1: 86.0), p1: s1(p0: [s0(p0: [[87.0], [88.0]], p1: 89.0)], p1: [[s0(p0: [[90.0], [91.0]], p1: 92.0)], [s0(p0: [[93.0], [94.0]], p1: 95.0)]])), p3: [s3(p0: s0(p0: [[96.0], [97.0]], p1: 98.0), p1: s1(p0: [s0(p0: [[99.0], [100.0]], p1: 101.0)], p1: [[s0(p0: [[102.0], [103.0]], p1: 104.0)], [s0(p0: [[105.0], [106.0]], p1: 107.0)]])), s3(p0: s0(p0: [[108.0], [109.0]], p1: 110.0), p1: s1(p0: [s0(p0: [[111.0], [112.0]], p1: 113.0)], p1: [[s0(p0: [[114.0], [115.0]], p1: 116.0)], [s0(p0: [[117.0], [118.0]], p1: 119.0)]]))]))]]
    let v1: Double = 120.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 120.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
