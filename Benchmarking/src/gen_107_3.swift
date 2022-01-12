  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: s0
    var p2: [s0]
    var p3: s0
    var p4: s1
    var p5: s1
    var p6: s0
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [[s0]], _ v2: [s0], _ v3: [[s0]], _ v4: s1, _ v5: Double) -> Double {
    let v11: s0 = v0.p1
    let v8: [s0] = v3[0]
    let v26: s0 = v8[0]
    let v56: Double = v11.p1
    var v35: s0 = v26
    v35.p1 = v56
    let v24: [[Double]] = v35.p0
    v35.p0 = v24
    v35.p0 = v24
    let v27: [Double] = v24[0]
    let v46: Double = v27[0]
    v35.p0 = v24
    return v46
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0]], p1: 2.0), p1: s0(p0: [[3.0], [4.0]], p1: 5.0), p2: [s0(p0: [[6.0], [7.0]], p1: 8.0)], p3: s0(p0: [[9.0], [10.0]], p1: 11.0), p4: s1(p0: s0(p0: [[12.0], [13.0]], p1: 14.0), p1: [[s0(p0: [[15.0], [16.0]], p1: 17.0)], [s0(p0: [[18.0], [19.0]], p1: 20.0)], [s0(p0: [[21.0], [22.0]], p1: 23.0)]]), p5: s1(p0: s0(p0: [[24.0], [25.0]], p1: 26.0), p1: [[s0(p0: [[27.0], [28.0]], p1: 29.0)], [s0(p0: [[30.0], [31.0]], p1: 32.0)], [s0(p0: [[33.0], [34.0]], p1: 35.0)]]), p6: s0(p0: [[36.0], [37.0]], p1: 38.0))
    let v1: [[s0]] = [[s0(p0: [[39.0], [40.0]], p1: 41.0)], [s0(p0: [[42.0], [43.0]], p1: 44.0)]]
    let v2: [s0] = [s0(p0: [[45.0], [46.0]], p1: 47.0), s0(p0: [[48.0], [49.0]], p1: 50.0), s0(p0: [[51.0], [52.0]], p1: 53.0)]
    let v3: [[s0]] = [[s0(p0: [[54.0], [55.0]], p1: 56.0)], [s0(p0: [[57.0], [58.0]], p1: 59.0)], [s0(p0: [[60.0], [61.0]], p1: 62.0)]]
    let v4: s1 = s1(p0: s0(p0: [[63.0], [64.0]], p1: 65.0), p1: [[s0(p0: [[66.0], [67.0]], p1: 68.0)], [s0(p0: [[69.0], [70.0]], p1: 71.0)], [s0(p0: [[72.0], [73.0]], p1: 74.0)]])
    let v5: Double = 75.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 75.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
