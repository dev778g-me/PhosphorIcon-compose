package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.GrainsSlashThin: ImageVector
    get() {
        if (_GrainsSlashThin != null) {
            return _GrainsSlashThin!!
        }
        _GrainsSlashThin = ImageVector.Builder(
            name = "Thin.GrainsSlashThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 224f)
                horizontalLineToRelative(0f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, -80f)
                verticalLineTo(120f)
                horizontalLineToRelative(0f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 120f)
                verticalLineTo(64f)
                horizontalLineToRelative(0f)
                arcToRelative(79.89f, 79.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64.83f, 33.12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(205.14f, 165.28f)
                arcTo(80.3f, 80.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 144f)
                verticalLineTo(120f)
                horizontalLineToRelative(0f)
                arcToRelative(79.63f, 79.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -36.18f, 8.63f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(146.71f, 148.58f)
                arcTo(79.68f, 79.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 200f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(0f)
                arcToRelative(79.86f, 79.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 61.29f, -28.58f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 120f)
                verticalLineTo(64f)
                horizontalLineToRelative(0f)
                arcToRelative(79.92f, 79.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25.63f, 4.19f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(98.5f, 48f)
                arcTo(104.72f, 104.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 24f)
                reflectiveCurveTo(160.39f, 40.19f, 172f, 72.58f)
            }
        }.build()

        return _GrainsSlashThin!!
    }

@Suppress("ObjectPropertyName")
private var _GrainsSlashThin: ImageVector? = null
