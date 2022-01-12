  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
    var p2: [[s0]]
  }
  struct s3 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: [s3], _ v2: Double) -> Double {
    var v4: Double = v2
    var v7: Double = v2
    var v8: Double = v7
    let v12: Double = v8 / v7
    var v19: Double = v8
    var v60: Double = v12
    let v36: Double = v19 + v2
    v7 = v2
    v4 = v36
    var v198: Double = v4
    v60 = v19
    let v91: [Double] = [v198, v60]
    let v305: Double = v91[0]
    return v305
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]])), s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]])), s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]]))], p1: s0(p0: [[18.0], [19.0]], p1: [[20.0]]), p2: [[s0(p0: [[21.0], [22.0]], p1: [[23.0]])], [s0(p0: [[24.0], [25.0]], p1: [[26.0]])]])], [s2(p0: [s1(p0: s0(p0: [[27.0], [28.0]], p1: [[29.0]]), p1: s0(p0: [[30.0], [31.0]], p1: [[32.0]])), s1(p0: s0(p0: [[33.0], [34.0]], p1: [[35.0]]), p1: s0(p0: [[36.0], [37.0]], p1: [[38.0]])), s1(p0: s0(p0: [[39.0], [40.0]], p1: [[41.0]]), p1: s0(p0: [[42.0], [43.0]], p1: [[44.0]]))], p1: s0(p0: [[45.0], [46.0]], p1: [[47.0]]), p2: [[s0(p0: [[48.0], [49.0]], p1: [[50.0]])], [s0(p0: [[51.0], [52.0]], p1: [[53.0]])]])], [s2(p0: [s1(p0: s0(p0: [[54.0], [55.0]], p1: [[56.0]]), p1: s0(p0: [[57.0], [58.0]], p1: [[59.0]])), s1(p0: s0(p0: [[60.0], [61.0]], p1: [[62.0]]), p1: s0(p0: [[63.0], [64.0]], p1: [[65.0]])), s1(p0: s0(p0: [[66.0], [67.0]], p1: [[68.0]]), p1: s0(p0: [[69.0], [70.0]], p1: [[71.0]]))], p1: s0(p0: [[72.0], [73.0]], p1: [[74.0]]), p2: [[s0(p0: [[75.0], [76.0]], p1: [[77.0]])], [s0(p0: [[78.0], [79.0]], p1: [[80.0]])]])]]
    let v1: [s3] = [s3(p0: s0(p0: [[81.0], [82.0]], p1: [[83.0]]), p1: s0(p0: [[84.0], [85.0]], p1: [[86.0]]))]
    let v2: Double = 87.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 87.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
