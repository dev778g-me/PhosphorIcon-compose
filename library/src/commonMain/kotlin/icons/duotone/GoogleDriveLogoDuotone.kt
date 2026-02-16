package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.GoogleDriveLogoDuotone: ImageVector
    get() {
        if (_GoogleDriveLogoDuotone != null) {
            return _GoogleDriveLogoDuotone!!
        }
        _GoogleDriveLogoDuotone = ImageVector.Builder(
            name = "Duotone.GoogleDriveLogoDuotone",
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
                moveTo(55.12f, 206.8f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52.38f, 204f)
                lineTo(25.05f, 156.15f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 152f)
                horizontalLineTo(88f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(232f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.05f, 4.15f)
                lineTo(203.62f, 204f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.74f, 2.83f)
                lineTo(168f, 152f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(96.59f, 33f)
                arcToRelative(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.84f, -1f)
                horizontalLineToRelative(55.14f)
                arcToRelative(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.84f, 1f)
                lineTo(128f, 85.33f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(93.65f, 35.76f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100.43f, 32f)
                horizontalLineToRelative(55.14f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.78f, 3.76f)
                lineToRelative(68.43f, 112.18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, 8.21f)
                lineTo(203.62f, 204f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.94f, 4f)
                horizontalLineTo(59.32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.94f, -4f)
                lineTo(25.05f, 156.15f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, -8.21f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(55.12f, 206.8f)
                lineTo(159.41f, 32.98f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(200.88f, 206.8f)
                lineTo(96.59f, 32.98f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 152f)
                lineTo(232f, 152f)
            }
        }.build()

        return _GoogleDriveLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleDriveLogoDuotone: ImageVector? = null
