package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.FlowerTulipDuotone: ImageVector
    get() {
        if (_FlowerTulipDuotone != null) {
            return _FlowerTulipDuotone!!
        }
        _FlowerTulipDuotone = ImageVector.Builder(
            name = "Duotone.FlowerTulipDuotone",
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
                moveTo(128f, 136f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 41.23f, -70f)
                verticalLineToRelative(0f)
                curveTo(156f, 38f, 128f, 24f, 128f, 24f)
                reflectiveCurveTo(100f, 38f, 86.77f, 66f)
                verticalLineToRelative(0f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 136f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 56f)
                horizontalLineToRelative(0f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 80f)
                verticalLineToRelative(40f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0f)
                horizontalLineToRelative(0f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 96f)
                verticalLineTo(56f)
                arcTo(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 176f)
                lineToRelative(-0f, -0f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0f, -0f)
                lineTo(128f, 136f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, -80f)
                lineToRelative(-0f, -0f)
                arcToRelative(0f, 0f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0f, -0f)
                lineTo(208f, 96f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 176f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 208f)
                lineToRelative(48f, 24f)
                lineToRelative(48f, -24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(86.77f, 66f)
                curveTo(100f, 38f, 128f, 24f, 128f, 24f)
                reflectiveCurveToRelative(28f, 14f, 41.23f, 42f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 232f)
                lineTo(128f, 176f)
            }
        }.build()

        return _FlowerTulipDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FlowerTulipDuotone: ImageVector? = null
