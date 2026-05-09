package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GitCommitFill: ImageVector
    get() {
        if (_GitCommitFill != null) {
            return _GitCommitFill!!
        }
        _GitCommitFill = ImageVector.Builder(
            name = "Filled.GitCommitFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(183.42f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -110.84f, 0f)
                horizontalLineTo(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(72.58f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 110.84f, 0f)
                horizontalLineTo(248f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 128f)
                close()
            }
        }.build()

        return _GitCommitFill!!
    }

@Suppress("ObjectPropertyName")
private var _GitCommitFill: ImageVector? = null
