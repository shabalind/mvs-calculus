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
    var p0: [[s1]]
    var p1: [Double]
  }
  struct s6 {
    var p0: [[s2]]
    var p1: [s1]
  }
  struct s9 {
    var p0: [s2]
    var p1: s1
    var p2: s6
  }
  func f11(_ v0: Double) -> Double {
    var v4: Double = v0
    var v2: Double = v4
    let v5: [Double] = [v2, v0, v0]
    let v6: Double = v5[2]
    return v6
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: Double) -> Double {
    let v4: Double = f11(v1)
    var v3: Double = v4
    let v18: Double = f11(v3)
    return v18
  }
  func benchmark() {
    let v0: s9 = s9(p0: [s2(p0: [[s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]))]], p1: [8.0])], p1: s1(p0: s0(p0: [[9.0], [10.0], [11.0]], p1: [[12.0]]), p1: s0(p0: [[13.0], [14.0], [15.0]], p1: [[16.0]])), p2: s6(p0: [[s2(p0: [[s1(p0: s0(p0: [[17.0], [18.0], [19.0]], p1: [[20.0]]), p1: s0(p0: [[21.0], [22.0], [23.0]], p1: [[24.0]]))]], p1: [25.0])], [s2(p0: [[s1(p0: s0(p0: [[26.0], [27.0], [28.0]], p1: [[29.0]]), p1: s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0]]))]], p1: [34.0])], [s2(p0: [[s1(p0: s0(p0: [[35.0], [36.0], [37.0]], p1: [[38.0]]), p1: s0(p0: [[39.0], [40.0], [41.0]], p1: [[42.0]]))]], p1: [43.0])]], p1: [s1(p0: s0(p0: [[44.0], [45.0], [46.0]], p1: [[47.0]]), p1: s0(p0: [[48.0], [49.0], [50.0]], p1: [[51.0]])), s1(p0: s0(p0: [[52.0], [53.0], [54.0]], p1: [[55.0]]), p1: s0(p0: [[56.0], [57.0], [58.0]], p1: [[59.0]])), s1(p0: s0(p0: [[60.0], [61.0], [62.0]], p1: [[63.0]]), p1: s0(p0: [[64.0], [65.0], [66.0]], p1: [[67.0]]))]))
    let v1: Double = 68.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 68.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
