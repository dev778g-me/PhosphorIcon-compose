package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.LinuxLogoDuotone: ImageVector
    get() {
        if (_LinuxLogoDuotone != null) {
            return _LinuxLogoDuotone!!
        }
        _LinuxLogoDuotone = ImageVector.Builder(
            name = "Duotone.LinuxLogoDuotone",
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
                moveTo(88f, 208f)
                curveToRelative(8f, -14.35f, 22.91f, -24f, 40f, -24f)
                reflectiveCurveToRelative(32f, 9.65f, 40f, 24f)
                horizontalLineToRelative(56f)
                reflectiveCurveToRelative(-32f, -40f, -32f, -120f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 88f)
                curveToRelative(0f, 80f, -32f, 120f, -32f, 120f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 208f)
                reflectiveCurveTo(64f, 168f, 64f, 88f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 0f)
                curveToRelative(0f, 80f, 32f, 120f, 32f, 120f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(100f, 100f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 100f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 136f)
                lineToRelative(-32f, 16f)
                lineToRelative(-32f, -16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 208f)
                curveToRelative(8f, -14.35f, 22.91f, -24f, 40f, -24f)
                reflectiveCurveToRelative(32f, 9.65f, 40f, 24f)
            }
        }.build()

        return _LinuxLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _LinuxLogoDuotone: ImageVector? = null
