package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CalendarSlashFill: ImageVector
    get() {
        if (_CalendarSlashFill != null) {
            return _CalendarSlashFill!!
        }
        _CalendarSlashFill = ImageVector.Builder(
            name = "Filled.CalendarSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 48f)
                verticalLineTo(187.57f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 2.7f)
                lineTo(116.8f, 80f)
                horizontalLineTo(208f)
                verticalLineTo(48f)
                horizontalLineTo(184f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.52f, 8f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 55.73f)
                verticalLineTo(48f)
                horizontalLineTo(87.71f)
                lineToRelative(-8.46f, -9.31f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -6.69f)
                horizontalLineTo(168f)
                verticalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.52f, -8f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 24.27f)
                verticalLineTo(32f)
                horizontalLineToRelative(24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(213.92f, 210.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 224f)
                horizontalLineTo(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.93f, 2.62f)
                close()
                moveTo(73.55f, 80f)
                lineTo(48f, 51.89f)
                verticalLineTo(80f)
                close()
            }
        }.build()

        return _CalendarSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarSlashFill: ImageVector? = null
