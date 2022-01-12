  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s2], _ v2: s2, _ v3: s1, _ v4: s0, _ v5: s2, _ v6: Double) -> Double {
    let v7: [Double] = [v6, v6]
    var v16: Double = v6
    var v12: [Double] = v7
    var v21: Double = v6
    var v37: Double = v16
    v12[0] = v6
    let v53: Double = v12[1]
    v12[1] = v37
    let v26: Double = v12[1]
    let v34: Double = v7[0]
    v12[0] = v21
    v21 = v34
    v12[0] = v53
    v12[1] = v21
    v12[1] = v16
    let v58: Double = v7[0]
    v12[1] = v26
    v12[0] = v26
    var v39: Double = v16
    v12[0] = v34
    let v61: Double = v12[0]
    let v155: [Double] = [v39, v58, v58, v61, v58, v39, v53]
    v12[1] = v26
    var v97: [Double] = v155
    v12[1] = v61
    v21 = v61
    v12[0] = v34
    let v355: Double = v97[4]
    return v355
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: 3.0), p1: [s0(p0: [[4.0], [5.0], [6.0]], p1: 7.0), s0(p0: [[8.0], [9.0], [10.0]], p1: 11.0)])
    let v1: [s2] = [s2(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: 15.0), p1: [s0(p0: [[16.0], [17.0], [18.0]], p1: 19.0), s0(p0: [[20.0], [21.0], [22.0]], p1: 23.0)]), s2(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: 27.0), p1: [s0(p0: [[28.0], [29.0], [30.0]], p1: 31.0), s0(p0: [[32.0], [33.0], [34.0]], p1: 35.0)]), s2(p0: s0(p0: [[36.0], [37.0], [38.0]], p1: 39.0), p1: [s0(p0: [[40.0], [41.0], [42.0]], p1: 43.0), s0(p0: [[44.0], [45.0], [46.0]], p1: 47.0)])]
    let v2: s2 = s2(p0: s0(p0: [[48.0], [49.0], [50.0]], p1: 51.0), p1: [s0(p0: [[52.0], [53.0], [54.0]], p1: 55.0), s0(p0: [[56.0], [57.0], [58.0]], p1: 59.0)])
    let v3: s1 = s1(p0: s0(p0: [[60.0], [61.0], [62.0]], p1: 63.0), p1: s0(p0: [[64.0], [65.0], [66.0]], p1: 67.0))
    let v4: s0 = s0(p0: [[68.0], [69.0], [70.0]], p1: 71.0)
    let v5: s2 = s2(p0: s0(p0: [[72.0], [73.0], [74.0]], p1: 75.0), p1: [s0(p0: [[76.0], [77.0], [78.0]], p1: 79.0), s0(p0: [[80.0], [81.0], [82.0]], p1: 83.0)])
    let v6: Double = 84.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 84.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5, v6)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
