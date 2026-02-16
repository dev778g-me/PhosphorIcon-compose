package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.PanoramaDuotone: ImageVector
    get() {
        if (_PanoramaDuotone != null) {
            return _PanoramaDuotone!!
        }
        _PanoramaDuotone = ImageVector.Builder(
            name = "Duotone.PanoramaDuotone",
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
                moveTo(236.53f, 198.59f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 192f)
                verticalLineTo(64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 230f, 56.27f)
                curveTo(212.65f, 60.89f, 174.56f, 72f, 128f, 72f)
                reflectiveCurveTo(43.35f, 60.89f, 26.05f, 56.27f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 64f)
                verticalLineToRelative(96.68f)
                lineToRelative(54.34f, -54.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineTo(131.31f, 156f)
                lineTo(157f, 130.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.31f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.05f, -7.74f)
                curveTo(43.35f, 60.89f, 81.44f, 72f, 128f, 72f)
                reflectiveCurveTo(212.65f, 60.89f, 230f, 56.27f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 64f)
                verticalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.06f, 7.73f)
                curveTo(212.63f, 195.08f, 174.55f, 184f, 128f, 184f)
                reflectiveCurveTo(43.37f, 195.08f, 26.06f, 199.72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 192f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(204f, 108f)
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
                moveTo(16f, 160.69f)
                lineToRelative(54.34f, -54.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(79.46f, 79.46f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(131.31f, 156f)
                lineTo(157f, 130.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.31f, 0f)
                lineToRelative(68.25f, 68.25f)
            }
        }.build()

        return _PanoramaDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaDuotone: ImageVector? = null
