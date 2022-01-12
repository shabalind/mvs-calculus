  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s1
  }
  struct s3 {
    var p0: [[s2]]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: s2, _ v2: s3, _ v3: Double) -> Double {
    let v6: [s1] = v1.p0
    var v7: Double = v3
    let v14: s1 = v6[1]
    let v38: s0 = v14.p1
    let v17: [[Double]] = v38.p1
    let v24: Double = v3 / v7
    let v43: [Double] = v17[0]
    let v63: Double = v3 / v24
    let v49: Double = v43[0]
    let v172: Double = v49 * v63
    return v172
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: [s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: s0(p0: [[6.0], [7.0]], p1: [[8.0]])), s1(p0: [s0(p0: [[9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0]])], p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]]))], p1: s1(p0: [s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]])], p1: s0(p0: [[24.0], [25.0]], p1: [[26.0]])))]]
    let v1: s2 = s2(p0: [s1(p0: [s0(p0: [[27.0], [28.0]], p1: [[29.0]]), s0(p0: [[30.0], [31.0]], p1: [[32.0]])], p1: s0(p0: [[33.0], [34.0]], p1: [[35.0]])), s1(p0: [s0(p0: [[36.0], [37.0]], p1: [[38.0]]), s0(p0: [[39.0], [40.0]], p1: [[41.0]])], p1: s0(p0: [[42.0], [43.0]], p1: [[44.0]]))], p1: s1(p0: [s0(p0: [[45.0], [46.0]], p1: [[47.0]]), s0(p0: [[48.0], [49.0]], p1: [[50.0]])], p1: s0(p0: [[51.0], [52.0]], p1: [[53.0]])))
    let v2: s3 = s3(p0: [[s2(p0: [s1(p0: [s0(p0: [[54.0], [55.0]], p1: [[56.0]]), s0(p0: [[57.0], [58.0]], p1: [[59.0]])], p1: s0(p0: [[60.0], [61.0]], p1: [[62.0]])), s1(p0: [s0(p0: [[63.0], [64.0]], p1: [[65.0]]), s0(p0: [[66.0], [67.0]], p1: [[68.0]])], p1: s0(p0: [[69.0], [70.0]], p1: [[71.0]]))], p1: s1(p0: [s0(p0: [[72.0], [73.0]], p1: [[74.0]]), s0(p0: [[75.0], [76.0]], p1: [[77.0]])], p1: s0(p0: [[78.0], [79.0]], p1: [[80.0]])))]], p1: s0(p0: [[81.0], [82.0]], p1: [[83.0]]))
    let v3: Double = 84.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 84.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
