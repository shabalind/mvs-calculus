  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: [[s1]]
    var p1: [[s0]]
  }
  func f29(_ v0: [s1]) -> [s1] {
    return v0
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: Double) -> Double {
    let v7: s2 = v0[1]
    let v3: [[s1]] = v7.p0
    let v2: [s1] = v3[2]
    let v4: [s1] = f29(v2)
    let v31: s1 = v4[0]
    let v73: [s0] = v31.p0
    let v48: s0 = v73[2]
    let v44: [Double] = v48.p1
    let v39: Double = v44[0]
    return v39
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [[s1(p0: [s0(p0: [[0.0]], p1: [1.0]), s0(p0: [[2.0]], p1: [3.0]), s0(p0: [[4.0]], p1: [5.0])], p1: s0(p0: [[6.0]], p1: [7.0]))], [s1(p0: [s0(p0: [[8.0]], p1: [9.0]), s0(p0: [[10.0]], p1: [11.0]), s0(p0: [[12.0]], p1: [13.0])], p1: s0(p0: [[14.0]], p1: [15.0]))], [s1(p0: [s0(p0: [[16.0]], p1: [17.0]), s0(p0: [[18.0]], p1: [19.0]), s0(p0: [[20.0]], p1: [21.0])], p1: s0(p0: [[22.0]], p1: [23.0]))]], p1: [[s0(p0: [[24.0]], p1: [25.0])]]), s2(p0: [[s1(p0: [s0(p0: [[26.0]], p1: [27.0]), s0(p0: [[28.0]], p1: [29.0]), s0(p0: [[30.0]], p1: [31.0])], p1: s0(p0: [[32.0]], p1: [33.0]))], [s1(p0: [s0(p0: [[34.0]], p1: [35.0]), s0(p0: [[36.0]], p1: [37.0]), s0(p0: [[38.0]], p1: [39.0])], p1: s0(p0: [[40.0]], p1: [41.0]))], [s1(p0: [s0(p0: [[42.0]], p1: [43.0]), s0(p0: [[44.0]], p1: [45.0]), s0(p0: [[46.0]], p1: [47.0])], p1: s0(p0: [[48.0]], p1: [49.0]))]], p1: [[s0(p0: [[50.0]], p1: [51.0])]])]
    let v1: Double = 52.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 52.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
