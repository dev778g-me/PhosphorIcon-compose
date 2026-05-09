package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ChatSlashFill: ImageVector
    get() {
        if (_ChatSlashFill != null) {
            return _ChatSlashFill!!
        }
        _ChatSlashFill = ImageVector.Builder(
            name = "Filled.ChatSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.92f, 210.61f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.84f, 10.76f)
                lineTo(189.92f, 208f)
                horizontalLineTo(83f)
                lineToRelative(-32.6f, 28.16f)
                lineToRelative(-0.08f, 0.07f)
                arcTo(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 240f)
                arcToRelative(16.13f, 16.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.8f, -1.52f)
                arcTo(15.85f, 15.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 224f)
                verticalLineTo(64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 48f)
                horizontalLineToRelative(4.46f)
                lineToRelative(-2.38f, -2.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.92f, 34.62f)
                close()
                moveTo(216f, 48f)
                horizontalLineTo(96.75f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 6.69f)
                lineTo(225f, 199.06f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -2.69f)
                verticalLineTo(64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 48f)
                close()
            }
        }.build()

        return _ChatSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatSlashFill: ImageVector? = null
