package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.GrainsSlashBold: ImageVector
    get() {
        if (_GrainsSlashBold != null) {
            return _GrainsSlashBold!!
        }
        _GrainsSlashBold = ImageVector.Builder(
            name = "Bold.GrainsSlashBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 224f)
                horizontalLineToRelative(0f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, -80f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(0f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 136f)
                verticalLineTo(64f)
                horizontalLineToRelative(0f)
                arcToRelative(79.92f, 79.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25.63f, 4.19f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(103.94f, 42.07f)
                arcTo(103.5f, 103.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 24f)
                reflectiveCurveTo(160.39f, 40.19f, 172f, 72.58f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 136f)
                verticalLineTo(64f)
                horizontalLineToRelative(0f)
                arcToRelative(79.79f, 79.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -59.75f, 26.81f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(207.16f, 155.61f)
                arcTo(80.84f, 80.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 144f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(0f)
                arcToRelative(80.9f, 80.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -17f, 1.81f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(154.19f, 156.8f)
                arcTo(79.81f, 79.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 216f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(0f)
                arcToRelative(79.86f, 79.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 61.29f, -28.58f)
            }
        }.build()

        return _GrainsSlashBold!!
    }

@Suppress("ObjectPropertyName")
private var _GrainsSlashBold: ImageVector? = null
