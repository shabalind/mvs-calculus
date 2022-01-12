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
    var p0: s0
    var p1: s1
  }
  struct s3 {
    var p0: s2
    var p1: s1
  }
  func f39(_ v0: Double) -> Double {
    var v4: Double = v0
    var v6: Double = v4
    v6 = v4
    var v2: Double = v6
    var v12: Double = v2
    var v19: Double = v12
    return v19
  }
  @inline(never)
  func f0(_ v0: [[s3]], _ v1: Double) -> Double {
    let v6: Double = f39(v1)
    let v2: [Double] = [v6, v1, v6, v1, v6, v6]
    let v12: Double = v2[5]
    let v18: Double = f39(v12)
    return v18
  }
  func benchmark() {
    let v0: [[s3]] = [[s3(p0: s2(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: s1(p0: [s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]])], p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]]))), p1: s1(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0]]), s0(p0: [[15.0], [16.0]], p1: [[17.0]])], p1: s0(p0: [[18.0], [19.0]], p1: [[20.0]])))], [s3(p0: s2(p0: s0(p0: [[21.0], [22.0]], p1: [[23.0]]), p1: s1(p0: [s0(p0: [[24.0], [25.0]], p1: [[26.0]]), s0(p0: [[27.0], [28.0]], p1: [[29.0]])], p1: s0(p0: [[30.0], [31.0]], p1: [[32.0]]))), p1: s1(p0: [s0(p0: [[33.0], [34.0]], p1: [[35.0]]), s0(p0: [[36.0], [37.0]], p1: [[38.0]])], p1: s0(p0: [[39.0], [40.0]], p1: [[41.0]])))]]
    let v1: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
