  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
    var p2: [s0]
  }
  func f22(_ v0: Double) -> Double {
    var v2: Double = v0
    var v7: Double = v0
    var v5: Double = v2
    var v1: Double = v7
    var v4: Double = v5
    v2 = v1
    return v4
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s0], _ v2: [[s1]], _ v3: [[s2]], _ v4: [s0], _ v5: Double) -> Double {
    let v9: Double = v5 - v5
    let v12: Double = f22(v5)
    let v22: Double = v9 - v12
    let v180: Double = v22 + v9
    return v180
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0]]), s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]])]
    let v1: [s0] = [s0(p0: [[6.0]], p1: [[7.0]]), s0(p0: [[8.0]], p1: [[9.0]])]
    let v2: [[s1]] = [[s1(p0: [[s0(p0: [[10.0]], p1: [[11.0]])], [s0(p0: [[12.0]], p1: [[13.0]])]], p1: s0(p0: [[14.0]], p1: [[15.0]]))]]
    let v3: [[s2]] = [[s2(p0: [s1(p0: [[s0(p0: [[16.0]], p1: [[17.0]])], [s0(p0: [[18.0]], p1: [[19.0]])]], p1: s0(p0: [[20.0]], p1: [[21.0]])), s1(p0: [[s0(p0: [[22.0]], p1: [[23.0]])], [s0(p0: [[24.0]], p1: [[25.0]])]], p1: s0(p0: [[26.0]], p1: [[27.0]]))], p1: s0(p0: [[28.0]], p1: [[29.0]]), p2: [s0(p0: [[30.0]], p1: [[31.0]])])], [s2(p0: [s1(p0: [[s0(p0: [[32.0]], p1: [[33.0]])], [s0(p0: [[34.0]], p1: [[35.0]])]], p1: s0(p0: [[36.0]], p1: [[37.0]])), s1(p0: [[s0(p0: [[38.0]], p1: [[39.0]])], [s0(p0: [[40.0]], p1: [[41.0]])]], p1: s0(p0: [[42.0]], p1: [[43.0]]))], p1: s0(p0: [[44.0]], p1: [[45.0]]), p2: [s0(p0: [[46.0]], p1: [[47.0]])])]]
    let v4: [s0] = [s0(p0: [[48.0]], p1: [[49.0]])]
    let v5: Double = 50.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 50.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
