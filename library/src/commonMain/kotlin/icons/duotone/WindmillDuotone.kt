package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.WindmillDuotone: ImageVector
    get() {
        if (_WindmillDuotone != null) {
            return _WindmillDuotone!!
        }
        _WindmillDuotone = ImageVector.Builder(
            name = "Duotone.WindmillDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(107.9f, 130.14f)
                lineToRelative(-17.63f, 29.96f)
                lineToRelative(-10.27f, 71.9f)
                lineToRelative(96f, 0f)
                lineToRelative(-9.64f, -67.45f)
                lineToRelative(-58.46f, -34.41f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(148.1f, 61.86f)
                lineToRelative(-76f, -44.75f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11f, 2.83f)
                lineToRelative(-12f, 20.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.84f, 11f)
                lineToRelative(152.1f, 89.52f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.84f, 11f)
                lineToRelative(-12f, 20.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11f, 2.83f)
                lineToRelative(-76f, -44.75f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(93.86f, 75.9f)
                lineToRelative(-44.75f, 76f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, 11f)
                lineToRelative(20.34f, 12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, -2.84f)
                lineTo(172.76f, 20f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, -2.84f)
                lineToRelative(20.34f, 12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 11f)
                lineToRelative(-44.75f, 76f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 232f)
                lineTo(224f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(166.36f, 164.55f)
                lineTo(176f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(90.27f, 160.11f)
                lineTo(80f, 232f)
            }
        }.build()

        return _WindmillDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WindmillDuotone: ImageVector? = null
