package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NumberCircleEightFill: ImageVector
    get() {
        if (_NumberCircleEightFill != null) {
            return _NumberCircleEightFill!!
        }
        _NumberCircleEightFill = ImageVector.Builder(
            name = "Filled.NumberCircleEightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(148f, 152f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, -20f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148f, 152f)
                close()
                moveTo(128f, 116f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, -16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 116f)
                close()
                moveTo(232f, 128f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 24f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(164f, 152f)
                arcToRelative(35.93f, 35.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.19f, -28.61f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, -43.62f, 0f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 164f, 152f)
                close()
            }
        }.build()

        return _NumberCircleEightFill!!
    }

@Suppress("ObjectPropertyName")
private var _NumberCircleEightFill: ImageVector? = null
