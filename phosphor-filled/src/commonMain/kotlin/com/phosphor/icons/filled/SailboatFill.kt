package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SailboatFill: ImageVector
    get() {
        if (_SailboatFill != null) {
            return _SailboatFill!!
        }
        _SailboatFill = ImageVector.Builder(
            name = "Filled.SailboatFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(160f, 140f)
                lineTo(160f, 72.85f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, -2.69f)
                lineToRelative(55f, 60.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.43f, 10.26f)
                arcToRelative(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.58f, 3.12f)
                lineTo(164f, 144f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 140f)
                close()
                moveTo(247.21f, 172.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 168f)
                lineTo(144f, 168f)
                lineTo(144f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.21f, -5f)
                lineToRelative(-104f, 128f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 144f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(24f)
                lineTo(16f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.25f, 13f)
                lineToRelative(29.6f, 37f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.49f, 6f)
                lineTo(204.16f, 224f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.49f, -6f)
                lineToRelative(29.6f, -37f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 247.21f, 172.53f)
                close()
            }
        }.build()

        return _SailboatFill!!
    }

@Suppress("ObjectPropertyName")
private var _SailboatFill: ImageVector? = null
